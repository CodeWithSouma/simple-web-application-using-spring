package com.codewithsouma.simplewebapplicationusingspring;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
    @RequestMapping("/")
    @ResponseBody
    public String index(){
        return "Welcome Souma!!!";
    }
}
