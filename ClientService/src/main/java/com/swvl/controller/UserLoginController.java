package com.swvl.controller;

import com.swvl.exception.LoginException;
import com.swvl.model.CurrentUserSession;
import com.swvl.model.dto.UserLoginDTO;
import com.swvl.service.userService.UserLoginService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/swvl")
public class UserLoginController {

    @Autowired
    private UserLoginService userLoginService;

    @PostMapping("/user/login")
    public ResponseEntity<CurrentUserSession> logInUser(@Valid @RequestBody UserLoginDTO loginDTO) throws LoginException {
        CurrentUserSession currentUserSession = userLoginService.userLogin(loginDTO);
        return new ResponseEntity<CurrentUserSession>(currentUserSession, HttpStatus.ACCEPTED );
    }

    @PostMapping("/user/logout")
    public String logoutUser(@RequestParam(required = false) String key) throws LoginException {
        return userLoginService.userLogout(key);
    }

}
