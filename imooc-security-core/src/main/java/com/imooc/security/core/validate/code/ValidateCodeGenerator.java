package com.imooc.security.core.validate.code;

import org.springframework.web.context.request.ServletWebRequest;

/**
 * @author ysxc
 * @create 2021-05-27 7:43 下午
 */
public interface ValidateCodeGenerator {

    ValidateCode generate(ServletWebRequest request);


}
