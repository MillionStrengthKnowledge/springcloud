package com.millionstrengthknowledge.restful.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class RestfulService {    
    @GetMapping
    public String test(HttpServletRequest request) {
        return request.getServerPort()+": Service test message";
    }
}
