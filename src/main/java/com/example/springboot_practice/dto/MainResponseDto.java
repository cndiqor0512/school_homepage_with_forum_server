package com.example.springboot_practice.dto;


import lombok.Data;

import java.util.List;

@Data
public class MainResponseDto {
    private List<BoardResponseDto> mainBoardClass;
    private List<BoardResponseDto> mainBoardSchool;
    private List<BoardResponseDto> mainBoardClub;
    private List<CalendarResponseDto> mainCalendar;
    private List<FoodResponseDto> mainFood;
    private List<NoticeResponseDto> mainNotice;
    private List<CommunityResponseDto> mainCommunity;
    private List<UserResponseDto> getList;
}
