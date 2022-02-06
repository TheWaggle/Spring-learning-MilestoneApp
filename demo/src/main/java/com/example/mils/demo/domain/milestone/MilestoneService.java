package com.example.mils.demo.domain.milestone;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MilestoneService {
    
    public List<MilestoneEntity> findAll() {
        return List.of(
            new MilestoneEntity(1, "マイルストーン１", "説明１"),
            new MilestoneEntity(2, "マイルストーン2", "説明2"),
            new MilestoneEntity(3, "マイルストーン3", "説明3")
        );
    }
}
