package com.example.mils.demo.domain.milestone;

public class MilestoneEntity {
    private long id;
    private String milestone;
    private String description;

    //コンストラクタ
    public MilestoneEntity(long id, String milestone, String description){
        this.id = id;
        this.milestone = milestone;
        this.description = description;
    }

    //ゲッターとセッター
    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }


    public String getMilestone(){
        return milestone;
    }

    public void setMilestone(String milestone){
        this.milestone = milestone;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

}
