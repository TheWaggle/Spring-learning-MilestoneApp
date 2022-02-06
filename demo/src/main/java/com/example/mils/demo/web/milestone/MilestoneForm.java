package com.example.mils.demo.web.milestone;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class MilestoneForm {
    @NotBlank
    @Size(max=256)
    private String milestone;

    @NotBlank
    @Size(max=256)
    private String description;
    
}
