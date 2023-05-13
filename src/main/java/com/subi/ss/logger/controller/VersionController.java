package com.subi.ss.logger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {

    @GetMapping("/version")
    public String getVersion() {
        return "1.0";
    }

    @GetMapping("/version2")
    public String getVersion2() {
        return  "2.0";
    }
}
