package com.example.mils.demo.domain.auth;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

public class CustomUserDetails extends User {

    public CustomUserDetails( String username, String password, Collection<? extends GrantedAuthority> authorities ) {
        super(username, password, authorities);
    }
    
}
