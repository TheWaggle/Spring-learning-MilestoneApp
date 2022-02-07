package com.example.mils.demo.web.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.example.mils.demo.domain.auth.UserRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UniqUserNameValidator implements ConstraintValidator<UniqueUserName, String> {

    private final UserRepository userRepository;

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return userRepository.findByUserName(value).isEmpty(); //isEmpty()は値が空かどうかの判定 空ならtrue 
    }

}
