package com.dverbivskyi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class SystemInfoController {

    private static final DateTimeFormatter YYYY_MM_DD_HH_mm_ss = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @GetMapping(path = "/ping")
    public String ping() {
        return String.format("Service time is: %s", LocalDateTime.now().format(YYYY_MM_DD_HH_mm_ss));
    }
}
