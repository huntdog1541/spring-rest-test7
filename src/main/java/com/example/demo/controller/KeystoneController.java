package com.example.demo.controller;

import com.example.demo.model.KeystoneRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KeystoneController {

    @GetMapping("/keystone")
    public String KeystoneRequest(@RequestBody KeystoneRequest request)
    {
        return request.toString();
    }
}
