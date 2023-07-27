package com.bofa.demo.jsp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restcontroller")

public class TestRestController {

   @GetMapping("/hello")
    public String hello() {
       System.out.println("***** Hello from Get endpoint!");
        return ("***** Hello from Get endpoint!");
    }
}
