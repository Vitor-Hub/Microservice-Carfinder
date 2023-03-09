package com.hrsignup.hrsignup.resources;

import com.hrsignup.hrsignup.entities.SignUp;
import com.hrsignup.hrsignup.services.SignUpService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/signup")
public class SignUpResource {

    private SignUpService service;

    @GetMapping("/{workerId}")
    public ResponseEntity<SignUp> getUser(@PathVariable Long workerId) {

    }
}
