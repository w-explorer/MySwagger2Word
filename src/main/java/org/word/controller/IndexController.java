package org.word.controller;


import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * @author xiuyin.cui
 * @description
 * @date 2019/3/22 10:52
 */
@Controller
public class IndexController {


    @RequestMapping(value="/",method = RequestMethod.GET)
    public String index(HttpServletRequest request) {
        return "index";
    }
}
