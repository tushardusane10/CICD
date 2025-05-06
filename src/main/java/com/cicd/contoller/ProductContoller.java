package com.cicd.contoller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductContoller {
    @GetMapping("/products/")
    public ResponseEntity<String> getMessage() {
        return new ResponseEntity<>( "Hello From controller", HttpStatus.OK);
    }
}
