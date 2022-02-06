package com.example.mils.demo.web.milestone;

import java.util.List;

import com.example.mils.demo.domain.milestone.MilestoneEntity;
import com.example.mils.demo.domain.milestone.MilestoneService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MilestoneController {

    private final MilestoneService milestoneService = new MilestoneService();

    //GET /milestones
    @GetMapping("/milestones")
    public String showList(Model model) {
        model.addAttribute("milestoneList", milestoneService.findAll()); 
        return "milestones/list";
    }
}
