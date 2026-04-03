package com.vti.controller;

import java.time.Instant;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1/sys")
@CrossOrigin("*")
public class SysController {
    @GetMapping("/status")
    public ResponseEntity<Object> getStatus() {
        String msg = "Service is running - " + Instant.now().toString();
        return ResponseEntity.ok(msg);
    }
}
