package com.example.mils.demo.web.milestone;

import java.util.List;

import com.example.mils.demo.domain.milestone.MilestoneEntity;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MilestoneController {
    //GET /milestones
    @GetMapping("/milestones")
    public String showList(Model model) { //Javaのデータをthymeleafに渡す際にSpring data の　Model　を利用する
        //ハンドラーメソッドでModelを呼び出すとSpringからメソッド生成時にmodelのインスタンを受け取れる
        var milestoneList = List.of(
            new MilestoneEntity(1, "マイルストーン１", "説明１"),
            new MilestoneEntity(2, "マイルストーン2", "説明2"),
            new MilestoneEntity(3, "マイルストーン3", "説明3")
        );
        model.addAttribute("milestoneList", milestoneList); //このメソッドを使うと、thymleafにmodelのオブジェクトを渡せる
        //第１引数は、thymeleafが参照するキーを記入、第２引数は、thymeleafに渡すオブジェクトを指定する
        return "milestones/list"; //view名を渡す 今回は milestone/list を準備する
    }
}
