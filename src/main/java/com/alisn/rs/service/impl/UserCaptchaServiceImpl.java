package com.alisn.rs.service.impl;

import com.alisn.rs.service.UserCaptchaService;
import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA User: Sky-Net Date: 2017/1/3
 */
@Service
public class UserCaptchaServiceImpl implements UserCaptchaService {

    private final Producer captchaProducer;

    @Autowired
    public UserCaptchaServiceImpl(Producer captchaProducer) {
        this.captchaProducer = captchaProducer;
    }

    @Override
    public void getKaptchaImage(HttpServletRequest request, HttpServletResponse response) {
        ServletOutputStream out = null;
        try {
            HttpSession session = request.getSession();
            response.setDateHeader("Expires", 0);
            response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
            response.addHeader("Cache-Control", "post-check=0, pre-check=0");
            response.setHeader("Pragma", "no-cache");
            response.setContentType("image/jpeg");
            String capText = captchaProducer.createText();
            session.setAttribute(Constants.KAPTCHA_SESSION_KEY, capText);
            BufferedImage image = captchaProducer.createImage(capText);
            out = response.getOutputStream();
            ImageIO.write(image, "jpg", out);
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
