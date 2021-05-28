package com.imooc.dto;

/**
 * @author ysxc
 * @create 2021-05-25 1:53 下午
 */
public class FileInfo {

    public FileInfo(String path) {
        this.path = path;
    }

    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
