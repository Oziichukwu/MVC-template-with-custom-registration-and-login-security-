package com.example.censusApplication.services;

import com.example.censusApplication.data.dtos.UserRegistrationDto;
import com.example.censusApplication.data.models.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User save(UserRegistrationDto userRegistrationDto);
}
