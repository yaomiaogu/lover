package com.love.system.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userController {

    @GetMapping("/test/{string}")
    public String test(@PathVariable String string) {
        return "Hello Nacos :" + string;
    }
}
