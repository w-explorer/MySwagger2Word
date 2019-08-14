package org.word.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by XiuYin.Cui on 2018/1/11.
 */
@Data
@ApiModel("Response")
public class Response {

    /**
     * 返回参数
     */
    @ApiModelProperty(notes = "描述")

    private String description;

    /**
     * 参数名
     */
    @ApiModelProperty(notes = "参数名")

    private String name;

    /**
     * 备注
     */
    @ApiModelProperty(notes = "备注")

    private String remark;
}
