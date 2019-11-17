package com.origin.jenkinsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class JenkinsDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsDemoApplication.class, args);
    }

    @GetMapping("/hello")
    @ResponseBody
    public String home() {
        System.out.println("hello world !!!");
        System.out.println("JenkinsDemoApplication.home");
        System.out.println("true = " + true);
        return "hello world springboot !!!222";
    }
}
