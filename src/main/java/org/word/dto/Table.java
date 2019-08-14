package org.word.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * Created by XiuYin.Cui on 2018/1/11.
 */
@Data
@ApiModel("Table")
public class Table {

    /**
     * 大标题 tags
     */
    @ApiModelProperty(notes = "大标题 tags")

    private String title;
    /**
     * 小标题 summary
     */
    @ApiModelProperty(notes = "小标题 summary")

    private String tag;
    /**
     * url
     */
    @ApiModelProperty(notes = "url")

    private String url;

    /**
     * 描述
     */
    @ApiModelProperty(notes = "描述")

    private String description;

    /**
     * 请求参数格式
     */
    @ApiModelProperty(notes = "请求参数格式")

    private String requestForm;

    /**
     * 响应参数格式
     */
    @ApiModelProperty(notes = "响应参数格式")

    private String responseForm;

    /**
     * 请求方式
     */
    @ApiModelProperty(notes = "请求方式")

    private String requestType;

    /**
     * 请求体
     */
    @ApiModelProperty(notes = "请求体")

    private List<Request> requestList;

    /**
     * 返回体
     */
    @ApiModelProperty(notes = "返回体")

    private List<Response> responseList;

    /**
     * 请求参数
     */
    @ApiModelProperty(notes = "请求参数")

    private String requestParam;

    /**
     * 返回参数
     */
    @ApiModelProperty(notes = "返回参数")

    private String responseParam;
}
