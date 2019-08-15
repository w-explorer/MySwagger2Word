package org.word.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * @author wenc
 * @create 2019-08-02 18:14
 */
@Controller
public class IndexController {
    @RequestMapping(value="/",method = RequestMethod.GET)
    public String index(HttpServletRequest request) {
        return "index";
    }
}
