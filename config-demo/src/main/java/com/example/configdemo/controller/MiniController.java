package com.example.configdemo.controller;

import com.example.configdemo.config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties({AppConfig.class})
public class MiniController {
    @Autowired
    AppConfig appConfig;

    @RequestMapping("/mini")
    AppConfig mini() {
        return appConfig;
    }
}
