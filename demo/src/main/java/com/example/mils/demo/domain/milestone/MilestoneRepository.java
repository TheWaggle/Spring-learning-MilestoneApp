package com.example.mils.demo.domain.milestone;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MilestoneRepository {

    @Select("select * from milestones")
    List<MilestoneEntity> findAll();
}
