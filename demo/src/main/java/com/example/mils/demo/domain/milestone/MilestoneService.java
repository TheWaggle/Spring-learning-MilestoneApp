package com.example.mils.demo.domain.milestone;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MilestoneService {
    
    private final MilestoneRepository milestoneRepository;

    public List<MilestoneEntity> findAll() {
        return milestoneRepository.findAll();
    }

    @Transactional
    public void create(String milestone, String description){
        milestoneRepository.insert(milestone, description);

        throw new IllegalStateException("Exception");
    }
}
