package com.imooc.security.browser.support;

/**
 * @author ysxc
 * @create 2021-05-26 11:40 上午
 */
public class SimpleResponse {

    private Object content;

    public SimpleResponse(Object content) {
        this.content = content;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }
}
