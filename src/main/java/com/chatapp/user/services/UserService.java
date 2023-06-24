package com.chatapp.user.services;

import com.chatapp.user.UserResponse.UserResponse;
import com.chatapp.user.mapper.UserMapper;
import com.chatapp.user.repository.UserRepository;
import com.chatapp.user.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserResponse findUserById(String id) {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found with id: " + id));
        return UserMapper.toUserResponse(user);
    }
}

