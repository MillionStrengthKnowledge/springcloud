package com.millionstrengthknowledge.gateway.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/restfulgateway")
public class RestfulGateway {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public String getService() {
        String url = "http://restfulserver/service";
        return restTemplate.getForObject(url, String.class);
    }
}
