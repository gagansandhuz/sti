package com.smartsti.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexResourceController {

    @GetMapping
    public String welcome() {
        return "Welcome, Please use this url for Swagger: http://localhost:3000/swagger-ui.html#/";
    }

}
