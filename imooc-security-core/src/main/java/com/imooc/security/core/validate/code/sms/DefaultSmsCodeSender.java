package com.imooc.security.core.validate.code.sms;

/**
 * @author ysxc
 * @create 2021-05-28 11:22 上午
 */
public class DefaultSmsCodeSender implements SmsCodeSender{
    @Override
    public void send(String mobile, String code) {
        System.out.println("向手机" + mobile + "发送短信验证码" + code);
    }
}
