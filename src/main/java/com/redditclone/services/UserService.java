package com.redditclone.services;

import com.redditclone.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User getUserById(Long userId) {
        User user = new User();
        user.setUsername("Chris");
        return user;
    }

}
