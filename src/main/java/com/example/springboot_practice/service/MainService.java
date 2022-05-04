package com.example.springboot_practice.service;


import com.example.springboot_practice.dto.BoardResponseDto;
import com.example.springboot_practice.dto.MainResponseDto;
import com.example.springboot_practice.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class MainService {
    private final BoardRepository boardRepository;
    private final CalendarRepository calendarRepository;
    private final CommunityRepository communityRepository;
    private final FoodRepository foodRepository;
    private final NoticeRepository noticeRepository;
    private final UserRepository userRepository;

    public MainResponseDto getMainList(){
        MainResponseDto dto = new MainResponseDto();


        dto.setMainBoardClass(boardRepository.getBoardLimitClass());
        dto.setMainBoardClub(boardRepository.getBoardLimitClub());
        dto.setMainBoardSchool(boardRepository.getBoardLimitSchool());
        dto.setMainFood(foodRepository.getFoodLimit());
        dto.setMainCalendar(calendarRepository.getCalendarLimit());
        dto.setMainNotice(noticeRepository.getNoticeLimit());
        dto.setMainCommunity(communityRepository.getCommunityLimit());
        dto.setGetList((userRepository.getList()));
        System.out.println("Service");
        return dto;
    }
}
