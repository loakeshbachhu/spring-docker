package com.example.springdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDockerApplication {

    @GetMapping("/message")
    public String getMessage(){
        return "This is Docker Application";
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringDockerApplication.class, args);
    }

}
