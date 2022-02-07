package com.example.mils.demo.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

import lombok.RequiredArgsConstructor;

@EnableWebSecurity //セキュリティ関連を示すアノテーション
@RequiredArgsConstructor //finalのコンストラクタでnewをつけてない（初期化）されてないフィールド を引数にとるコンストラクタが生成される
public class SecurityConfig extends WebSecurityConfigurerAdapter{

    private final UserDetailsService userDetailsService; //finalで初期化されてないフィールド

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
            .mvcMatchers("/login**").permitAll()
            .anyRequest().authenticated()
            .and()
            .formLogin()
            .loginPage("/login");
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService) //コンストラクから渡されたuserDetailServiceをauth.userDetailsServiceに渡している
                .passwordEncoder(NoOpPasswordEncoder.getInstance()); //非推奨のクラスの為、後ほど書き換える。
    }   
}
