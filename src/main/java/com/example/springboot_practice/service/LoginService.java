package com.example.springboot_practice.service;

import com.example.springboot_practice.dto.LoginRequestDto;
import com.example.springboot_practice.dto.LoginResponseDto;
import com.example.springboot_practice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class LoginService {
    private final UserRepository userRepository;

    public LoginResponseDto getLoginSuccess(LoginRequestDto loginRequestDto) {

        LoginResponseDto userData = userRepository.getLoginData(loginRequestDto.getId(), loginRequestDto.getPw());
        System.out.println(userData);
        System.out.println("-----------------");
        System.out.print(userData.getIdentification() + ", "+ loginRequestDto.getId());
        if (userData.getIdentification().equals(loginRequestDto.getId())) {
            return userData;
        } else {
            return null;
        }
    }
}
