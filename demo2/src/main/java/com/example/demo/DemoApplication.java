package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatReactiveWebServerFactory;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.embedded.tomcat.TomcatWebServer;
import org.springframework.boot.web.server.WebServer;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext;
import org.springframework.http.HttpRequest;
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
//        TomcatServletWebServerFactory factory = new TomcatServletWebServerFactory();
//        ServletContextInitializer[] initializers = new ServletContextInitializer[1];
//        WebServer server = factory.getWebServer(initializers);
//        server.start();
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
