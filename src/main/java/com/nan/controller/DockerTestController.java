package com.nan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class DockerTestController {

    @GetMapping("docker")
    public String DockerDemo(){
        return "Hello Docker";
    }
}
