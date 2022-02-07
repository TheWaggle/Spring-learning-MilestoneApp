package com.example.mils.demo.domain.auth;

import java.util.Collections;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByUserName(username)
            .map(
                user -> new CustomUserDetails(
                        user.getUsername(), 
                        user.getPassword(), 
                        Collections.emptyList() //現時点は仮実装
                        )
            )
            .orElseThrow(
                () -> new UsernameNotFoundException(
                    "username is not found :" + username
                )
            );
    }
}
