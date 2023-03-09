package com.hrsignup.hrsignup.services;

import com.hrsignup.hrsignup.entities.SignUp;
import org.springframework.stereotype.Service;

@Service
public class SignUpService {

    public SignUp checkSignUp () {
        return new SignUp(1,"fullName", "email", "password");
    }
}
