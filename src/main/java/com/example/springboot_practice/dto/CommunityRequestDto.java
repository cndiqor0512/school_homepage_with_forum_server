package com.example.springboot_practice.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;

@Data
public class CommunityRequestDto {

    private String title;
    private Long publisher;
    private String contents;

}
