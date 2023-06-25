package com.chatapp.user.controller;

import com.chatapp.user.UserResponse.UserResponse;
import com.chatapp.user.config.AppConfig;
import com.chatapp.user.services.UserService;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserService userService;
    private final AppConfig appConfig;

    @GetMapping("/profile")
    //todo ensure id is correct format
    public ResponseEntity<UserResponse> getUserProfile(@RequestHeader("User-Id") String userId) {
        UserResponse userResponse = userService.findUserById(userId);
        return ResponseEntity.ok(userResponse);
    }

}
