package com.chatapp.user.mapper;

import com.chatapp.user.UserResponse.UserResponse;
import com.chatapp.user.model.User;

public class UserMapper {

    public static UserResponse toUserResponse(User user) {
        return UserResponse.builder()
                .id(user.getId())
                .username(user.getUsername())
                .email(user.getEmail())
                .build();
    }
}
