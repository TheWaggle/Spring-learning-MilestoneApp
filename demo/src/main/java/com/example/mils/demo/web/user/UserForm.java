package com.example.mils.demo.web.user;

import javax.validation.constraints.NotBlank;

import com.example.mils.demo.web.validation.UniqueUserName;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserForm {

    @NotBlank
    @UniqueUserName
    private String username;

    @NotBlank
    private String password;
    
}
