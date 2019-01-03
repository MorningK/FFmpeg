package com.example.configdemo.controller;

import com.example.configdemo.config.ExConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableConfigurationProperties({ExConfig.class})
@RestController
public class ExController {
    @Autowired
    ExConfig exConfig;

    @RequestMapping("/ex")
    ExConfig ex() {
        return  exConfig;
    }

}
