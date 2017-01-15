package com.alisn.rs.util;

import org.junit.Test;

/**
 * Created by Skynet on 2017/1/5 18:58.
 */
public class EncoderUtilTest {
    @Test
    public void md5EncodeWithSalt() throws Exception {
        //774c8d83f06c336ffa971367f692d2ae
        String encode = EncoderUtil.md5EncodeWithSalt("123456", "abcdef");
        System.out.println(encode);
    }

    @Test
    public void md5Encode() throws Exception {
        //e10adc3949ba59abbe56e057f20f883e
        String encode = EncoderUtil.md5Encode("123456");
        System.out.println(encode);
    }

    @Test
    public void sha256EncodeWithSalt() throws Exception {
        //c3e3d06ac501fbf00ce8eadcd921480d0ebbee48d32712328a3a5a4f810bc99f
        String encode = EncoderUtil.sha256EncodeWithSalt("123456","abcdef");
        System.out.println(encode);
    }

    @Test
    public void sha256Encode() throws Exception {
        //8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92
        String encode = EncoderUtil.sha256Encode("123456");
        System.out.println(encode);
    }

    @Test
    public void base64Encode() throws Exception {
        //MTIzNDU2
        String encode = EncoderUtil.base64Encode("123456");
        System.out.println(encode);
    }

    @Test
    public void base64Decode() throws Exception {
        //123456
        String encode = EncoderUtil.base64Encode("123456");
        String decode = EncoderUtil.base64Decode(encode);
        System.out.println(decode);
    }

}