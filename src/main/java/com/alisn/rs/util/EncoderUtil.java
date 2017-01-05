package com.alisn.rs.util;

import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

/**
 * Created by IntelliJ IDEA User: Sky-Net Date: 2017/1/5
 */
public class EncoderUtil {

    private static final Md5PasswordEncoder md5;
    private static final ShaPasswordEncoder sha;

    static{
        md5 = new Md5PasswordEncoder();
        //false：生成32位的Hex版，默认值为false
        //true：生成24位的Base64版
        md5.setEncodeHashAsBase64(false);

        sha = new ShaPasswordEncoder(256);
        sha.setEncodeHashAsBase64(false);
    }

    /**
     * MD5带盐加密
     * @param passWd：明文
     * @param salt：盐值
     * @return result:密文
     */
    public static String md5EncodeWithSalt(String passWd, String salt) {
        return md5.encodePassword(passWd, salt);
    }

    /**
     * MD5不带盐加密
     */
    public static String md5Encode(String passWd) {
        return md5.encodePassword(passWd, null);
    }

    /**
     * SHA256带盐加密
     */
    public static String sha256EncodeWithSalt(String passWd, String salt) {
        return sha.encodePassword(passWd, salt);
    }

    /**
     * SHA256不带盐加密
     */
    public static String sha256Encode(String passWd) {
        return sha.encodePassword(passWd, null);
    }

    /**
     * Base64加密
     */
    public static String base64Encode(String passWd) throws UnsupportedEncodingException {
        //通过UTF-8编码方式进行加密
        return Base64.getEncoder().encodeToString(passWd.getBytes("UTF-8"));
    }

    /**
     * Base64解密
     */
    public static String base64Decode(String passWd) throws UnsupportedEncodingException {
        //通过UTF-8编码方式进行解密
        return new String(Base64.getDecoder().decode(passWd),"UTF-8");
    }

    /**
     * 通用类禁止构造
     */
    private EncoderUtil(){}

}
