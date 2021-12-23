package com.springboot.graddle.springbootgraddle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/hello")
    public String SayHello(@RequestParam(name="username", defaultValue = "gradle venkat")String name)
    {
        return "Hello "+name+" !";
    }
}
