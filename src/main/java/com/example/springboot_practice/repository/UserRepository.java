package com.example.springboot_practice.repository;

import com.example.springboot_practice.dto.LoginRequestDto;
import com.example.springboot_practice.dto.LoginResponseDto;
import com.example.springboot_practice.dto.UserResponseDto;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper
public interface UserRepository {
    List<UserResponseDto> getList();

    UserResponseDto getData(Long userId);

    LoginResponseDto getLoginData(String id, String pw);
}
