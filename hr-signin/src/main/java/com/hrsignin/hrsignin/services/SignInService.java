package com.hrsignin.hrsignin.services;

import com.hrsignin.hrsignin.entities.SignIn;
import org.springframework.stereotype.Service;

@Service
public class SignInService {

    public SignIn getUser(long userId) {
        return new SignIn("nick", "rj@");
    }
}
