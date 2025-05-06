package com.cicd.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @GetMapping(value = "/products")
    public ResponseEntity<String> getMessage() {
        return new ResponseEntity<>( "Hello From controller", HttpStatus.OK);
    }
}
