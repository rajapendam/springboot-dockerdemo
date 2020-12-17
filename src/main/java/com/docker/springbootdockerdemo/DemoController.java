package com.docker.springbootdockerdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/message/{name}")
    public String getMessage(@PathVariable String name)
    {
        return "Welcome to the Docker World:"+name;
    }
}
