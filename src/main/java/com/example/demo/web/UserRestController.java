package com.example.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Created by mshekhaw on 2/2/2018
 */
@RestController
@RequestMapping("/")
public class UserRestController {

    @RequestMapping(
            value = "user",
            method = RequestMethod.GET)
    public Principal user(Principal user) {
        return user;
    }

}
