package com.imooc.security.core.validate.code.sms;

/**
 * @author ysxc
 * @create 2021-05-28 11:22 上午
 */
public interface SmsCodeSender {

    void send(String mobile, String code);
}
