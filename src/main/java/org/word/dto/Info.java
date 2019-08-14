package org.word.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author wenc
 * @create 2019-08-02 18:14
 */
@Data
@ApiModel("Info")
public class Info {
    /**
     * 描述
     */
    @ApiModelProperty(notes = "描述")
    private String description;

    /**
     * 版本信息
     */
    @ApiModelProperty(notes = "版本信息")
    private String version;

    /**
     * 标题
     */
    @ApiModelProperty(notes = "标题")
    private String title;

    /**
     * 服务条款网址
     */
    @ApiModelProperty(notes = "服务条款网址")
    private String termsofservice;

}
