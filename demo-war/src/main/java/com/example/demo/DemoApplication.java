package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @RequestMapping("/")
    String index() {
        return "Hello world!";
    }

    @RequestMapping("/hello/{name}")
    String hello(@PathVariable String name) {
        return "Hello "+name+"!";
    }

    @RequestMapping("/hi/{name}")
    void hi(@PathVariable String name, HttpServletRequest request, HttpServletResponse response) {
        try {
            response.sendRedirect(request.getContextPath()+"/hello/"+name);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

