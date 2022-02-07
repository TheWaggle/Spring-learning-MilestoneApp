package com.example.mils.demo.domain.auth;

import java.util.Optional;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserRepository {

    @Insert("insert into users (username, password) values (#{username}, #{password})")
    void insert(String username, String password);

    @Select("select * from users where username = #{username}")
    Optional<User> findByUserName(String username);

    @Select("select * from users")
    List<User> findAll();
    
}
