package org.word.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author wenc
 * @description
 * @create 2019-08-12 9:55
 */
@Data
@ApiModel("MiscroServiceSwaggerMessage")
public class MiscroServiceSwaggerMessage {
    @ApiModelProperty(notes = "方法体list")
    private List<Table> tables;
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
