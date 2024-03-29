package org.word.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author wenc
 * @description 对系统基本信息的封装
 * @create 2019-08-02 18:14
 */
@Data
@ApiModel("Root")
public class Root {
    /**
     *版本
     */
    @ApiModelProperty(notes = "版本")
    private String swagger;
    /**
     * 项目信息
     */
    @ApiModelProperty(notes = "项目信息")
    private Info info;

    /**
     * 主机地址
     */
    @ApiModelProperty(notes = "主机地址")
    private String host;
    /**
     *
     */
    @ApiModelProperty(notes = "")
    private String basePath;

}
