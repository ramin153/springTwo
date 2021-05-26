package com.example.other.controller;

import com.example.other.service.OtherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class OtherController {
    private final OtherService otherService;

    @Autowired
    public OtherController(OtherService otherService) {
        this.otherService = otherService;
    }

    public String talk()
    {
        return otherService.otherWord();
    }
}
