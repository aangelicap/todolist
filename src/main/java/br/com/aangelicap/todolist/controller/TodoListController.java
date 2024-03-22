package br.com.aangelicap.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todolist")
public class TodoListController {

    @GetMapping("/")
    public String firstMessage(){
        return "test here";
    }
}