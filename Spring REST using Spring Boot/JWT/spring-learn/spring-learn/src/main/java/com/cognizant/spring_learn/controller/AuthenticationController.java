package com.cognizant.spring_learn.controller;

import com.cognizant.spring_learn.model.AuthenticationResponse;
import com.cognizant.spring_learn.service.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Base64;

@RestController
public class AuthenticationController {

    @Autowired
    private JwtService jwtService;

    @GetMapping("/authenticate")
    public AuthenticationResponse authenticate(
            @RequestHeader("Authorization") String authHeader) {

        String base64 = authHeader.substring(6);

        String credentials = new String(Base64.getDecoder().decode(base64));

        String[] values = credentials.split(":");

        String username = values[0];

        String token = jwtService.generateToken(username);

        return new AuthenticationResponse(token);
    }
}