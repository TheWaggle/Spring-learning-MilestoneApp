package com.example.mils.demo.domain.auth;

import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserRepository {

    @Select("select * from users where username = #{username}")
    Optional<User> findByUserName(String username);
    
}
