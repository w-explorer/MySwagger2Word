package org.word.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.word.dto.Root;
import org.word.dto.Table;
import org.word.service.RootService;
import org.word.service.WordService;

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


    @RequestMapping("/toWord")
    public String toWord(Model model) {
//        String swaggerUrl = "http://localhost:8081/v2/api-docs";
        List<Table> tables = tableService.tableList(swaggerUrl);
        Root root = rootService.getRoot(swaggerUrl);
        model.addAttribute("tables", tables);
        model.addAttribute("root", root);
        return "word";
    }

}
