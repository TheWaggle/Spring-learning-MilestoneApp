package com.example.mils.demo.domain.auth;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }
    
    @Transactional
    public void create(String username, String password){
        userRepository.insert(username, password);
    }

}
