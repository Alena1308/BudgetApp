package me.martynova.budgetapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping
    public String helloWorld(){
        return "Приложение запущено!";
    }
    @GetMapping("/path/to/info")
    public String page(@RequestParam String info){
        return "Информация: " +
                "Имя ученика: Мартынова А.В. ** \n" +
                "Название проекта: BudgetApp ** \n" +
                "Дата создания проекта: 09.01.2023 ** \n" +
                "Первая работа над веб приложением \n" + info;
    }
}
