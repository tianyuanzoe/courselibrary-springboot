package com.application.courselibrary.controller;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zoetian
 * @create 2022/11/12
 */
public class indexController {
    @GetMapping("/")
    public String listHome(){
        return "index";
    }
}
