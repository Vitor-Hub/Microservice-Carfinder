package com.hrsignin.hrsignin.resources;

import com.hrsignin.hrsignin.entities.SignIn;
import com.hrsignin.hrsignin.services.SignInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/signin")
public class SignInResources {

    @Autowired
    private SignInService service;

    @GetMapping("/{userId}")
    public ResponseEntity<SignIn> getUser(@PathVariable Long userId) {
        SignIn user = service.getUser(userId);
        return ResponseEntity.ok(user);
    }
}
