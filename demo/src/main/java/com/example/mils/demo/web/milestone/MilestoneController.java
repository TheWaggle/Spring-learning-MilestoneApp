package com.example.mils.demo.web.milestone;

import com.example.mils.demo.domain.milestone.MilestoneService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/milestones")
@RequiredArgsConstructor
public class MilestoneController {

    private final MilestoneService milestoneService;

    //GET /milestones
    @GetMapping
    public String showList(Model model) {
        model.addAttribute("milestoneList", milestoneService.findAll()); 
        return "milestones/list";
    }

    @GetMapping("/creationForm")
    public String showCreationForm(@ModelAttribute MilestoneForm form) {
        return "milestones/creationForm";
    }

    @PostMapping
    public String create(@Validated MilestoneForm form, BindingResult bindingResult, Model model){
        if (bindingResult.hasErrors()){
            return showCreationForm(form);
        }
        milestoneService.create(form.getMilestone(), form.getDescription());
        return "redirect:/milestones";
    }
}
