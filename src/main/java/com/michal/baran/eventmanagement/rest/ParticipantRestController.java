package com.michal.baran.eventmanagement.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParticipantRestController {

    @GetMapping("/participants")
    public String welcome(){
        return "Welcome on Sports Event Management Registration System!";
    }
}
