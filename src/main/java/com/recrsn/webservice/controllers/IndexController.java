package com.recrsn.webservice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @GetMapping("/ping")
    @ResponseBody
    public String index() {
        return "pong";
    }
}
