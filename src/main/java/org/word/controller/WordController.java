package org.word.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.word.dto.MiscroServiceSwaggerMessage;
import org.word.dto.Root;
import org.word.dto.Table;
import org.word.service.RootService;
import org.word.service.WordService;
import org.word.utils.DateUtil;
import org.word.utils.ResponseEntity;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by XiuYin.Cui on 2018/1/11.
 */
@Controller
public class WordController {

    @Autowired
    private WordService tableService;
    @Autowired
    private RootService rootService;
    @Value("${swagger.url}")
    private String swaggerUrl;



    /**
     * @param model
     * @return
     *
//     * @see #toWord(Model)
     */
//    @Deprecated
//    @RequestMapping("/getWord")
//    public String getWord(Model model) {
//        List<Table> tables = tableService.tableList();
//        Root root = rootService.getRoot();
//        model.addAttribute("tables", tables);
//
//        model.addAttribute("root", root);
//        return "word";
//    }


    @ApiOperation(value = "解析目标swaggerUrl 预览生成的离线api文档",notes ="跳转到预览页面" )
    @ApiImplicitParam(value = "swagger api地址",name = "swaggerUrl",type = "String",required = true)
    @RequestMapping(value = "/toWord",method = RequestMethod.GET)
    public String toWord(Model model, HttpServletRequest request) {
        String swaggerUrl = request.getParameter("swaggerUrl");
        if(swaggerUrl.length()>0){
            this.swaggerUrl = swaggerUrl;
        }
        List<Table> tables = null;
        Root root = null;
        try {
            tables = tableService.tableList(this.swaggerUrl);
            root = rootService.getRoot(this.swaggerUrl);
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("msg", "swagger-url不可用");
            return "index";
        }
        model.addAttribute("tables", tables);
        model.addAttribute("root", root);
        model.addAttribute("nowDate", DateUtil.getFormatCurrentDate());
        return "word";
    }
    @ApiOperation(value = "拿到目标swagger.json解析后的封装数据" )
    @ApiImplicitParam(value = "swagger api地址",name = "swaggerUrl",type = "String",required = true)
    @ResponseBody
    @RequestMapping(value = "/getMiscroServiceMessage",method = RequestMethod.POST)
    public ResponseEntity<MiscroServiceSwaggerMessage> getMiscroServiceMessage(@RequestParam("swaggerUrl")String swaggerUrl) {
        if(swaggerUrl.length()>0){
            this.swaggerUrl = swaggerUrl;
        }
        List<Table> tables = null;
        Root root = null;
        MiscroServiceSwaggerMessage miscroServiceSwaggerMessage = new MiscroServiceSwaggerMessage();
        try {
            tables = tableService.tableList(this.swaggerUrl);
            root = rootService.getRoot(this.swaggerUrl);

            miscroServiceSwaggerMessage.setBasePath(root.getBasePath());
            miscroServiceSwaggerMessage.setHost(root.getHost());
            miscroServiceSwaggerMessage.setSwagger(root.getSwagger());
            miscroServiceSwaggerMessage.setInfo(root.getInfo());
            miscroServiceSwaggerMessage.setTables(tables);
            return ResponseEntity.SUCCESS.buildSuccess("seccess",miscroServiceSwaggerMessage);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.ERROR;
        }

    }
}
