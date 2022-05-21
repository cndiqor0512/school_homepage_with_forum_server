package com.example.springboot_practice.dto;

import lombok.Data;

@Data
public class LoginRequestDto {
    private String id;
    private String pw;
}
