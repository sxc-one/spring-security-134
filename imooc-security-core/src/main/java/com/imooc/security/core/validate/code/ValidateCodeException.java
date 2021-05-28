package com.imooc.security.core.validate.code;

import org.springframework.security.core.AuthenticationException;

/**
 * @author ysxc
 * @create 2021-05-27 10:26 上午
 */
public class ValidateCodeException extends AuthenticationException {

    private static final long serialVersionUID = -7285211528095468156L;

    public ValidateCodeException(String msg) {
        super(msg);
    }
}
