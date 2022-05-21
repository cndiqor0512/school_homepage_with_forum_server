package com.example.springboot_practice.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class LoginResponseDto {
    String name;
    String identification;
    String password;
}
