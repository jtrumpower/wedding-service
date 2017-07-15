package com.jtrumpower.weddingservice.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class GreetingController {

    @RequestMapping("/")
    public String greeting() {
        return "hellow world";
    }
}
