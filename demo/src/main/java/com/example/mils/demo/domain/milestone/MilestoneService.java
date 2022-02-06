package com.example.mils.demo.domain.milestone;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MilestoneService {
    
    private final MilestoneRepository milestoneRepository;

    public List<MilestoneEntity> findAll() {
        return milestoneRepository.findAll();
    }
}
