package com.example.mils.demo.web.user;

import com.example.mils.demo.domain.auth.UserService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {
    
    private final UserService userService;

    @GetMapping
    public String showList(Model model){
        model.addAttribute("userList", userService.findAll());
        return "users/list";
    }

    @GetMapping("/creationForm")
    public String showCreationForm(@ModelAttribute UserForm form){
        return "users/creationForm";
    }

    @PostMapping
    public String create(@Validated UserForm form, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return showCreationForm(form);
        }
        userService.create(form.getUsername(), form.getPassword());
        return "redirect:/users";
    }

}
