package org.word.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by XiuYin.Cui on 2018/1/11.
 */
@Data
@ApiModel("Request")

public class Request {

    /**
     * 参数名
     */
    @ApiModelProperty(notes = "参数名")
    private String name;

    /**
     * 数据类型
     */
    @ApiModelProperty(notes = "数据类型")
    private String type;

    /**
     * 参数类型
     */
    @ApiModelProperty(notes = "参数类型")

    private String paramType;

    /**
     * 是否必填
     */
    @ApiModelProperty(notes = "是否必填")

    private Boolean require;

    /**
     * 说明
     */
    @ApiModelProperty(notes = "说明")

    private String remark;
}
