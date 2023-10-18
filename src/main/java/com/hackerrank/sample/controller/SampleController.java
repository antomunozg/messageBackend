package com.hackerrank.sample.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/defaultHello")
    public ResponseEntity<Object> getDefaultHello(@RequestParam(name = "message", required = false) String message) {
        String finalMessage = (message != null) ? "Hello " + message : "Hello World!";
        Map<String, String> response = new HashMap<>();
        response.put("echo", finalMessage);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/customHello")
    public ResponseEntity<Object> postCustomHello(@RequestParam(name = "message", required = false) String message) {
        String finalMessage = (message != null) ? "Custom " + message : "Custom ";
        Map<String, String> response = new HashMap<>();
        response.put("echo", finalMessage);

        if (message != null) {
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
        }
    }

}
