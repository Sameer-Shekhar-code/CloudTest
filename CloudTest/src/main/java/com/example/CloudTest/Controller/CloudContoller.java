package com.example.CloudTest.Controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sound.midi.Soundbank;

@RestController
public class CloudContoller {

    @Value("${instance.name}")
    private String instanceName;

    @GetMapping("/test")
    public String print() {
        return "Hello from " + instanceName;
    }

}
