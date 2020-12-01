package com.example.hello;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class SimpleController {
    @GetMapping("/hello")
    public String sayHi() {
        return "Hello From the Server!!";
    }
}
