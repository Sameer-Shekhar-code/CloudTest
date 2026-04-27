package com.example.CloudTest.Controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sound.midi.Soundbank;
import java.net.InetAddress;

@RestController
public class CloudContoller {

    @GetMapping("/test")
    public String print() throws Exception {
        String hostname = InetAddress.getLocalHost().getHostName();
        return "Hello from Tanisha " + hostname;}

}
