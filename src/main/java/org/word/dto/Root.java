package org.word.dto;

import lombok.Data;

/**
 * @author wenc
 * @description 对系统基本信息的封装
 * @create 2019-08-02 18:14
 */
@Data
public class Root {
    /**
     *版本
     */
    private String swagger;
    /**
     * 项目信息
     */
    private Info info;

    /**
     * 主机地址
     */
    private String host;
    /**
     *
     */
    private String basePath;

}
