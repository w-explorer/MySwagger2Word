package org.word.dto;

import lombok.Data;

/**
 * @author wenc
 * @create 2019-08-02 18:14
 */
@Data
public class Info {
    /**
     * 描述
     */
    private String description;

    /**
     * 版本信息
     */
    private String version;

    /**
     * 标题
     */
    private String title;

    /**
     * 服务条款网址
     */
    private String termsofservice;

}
