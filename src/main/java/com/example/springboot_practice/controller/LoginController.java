package com.example.springboot_practice.controller;

import com.example.springboot_practice.dto.LoginRequestDto;
import com.example.springboot_practice.dto.LoginResponseDto;
import com.example.springboot_practice.service.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LoginController {
    private final LoginService loginService;

    @PostMapping("/api/login")
    public LoginResponseDto getUserData(@RequestBody LoginRequestDto loginRequestDto){ return loginService.getLoginSuccess(loginRequestDto);}
}
