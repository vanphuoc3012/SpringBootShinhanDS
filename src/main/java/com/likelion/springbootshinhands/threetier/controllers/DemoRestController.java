package com.likelion.springbootshinhands.threetier.controllers;

import com.likelion.springbootshinhands.threetier.entities.Todo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class DemoRestController {

    private List<Todo> todoList = new ArrayList<>();

    @PostConstruct
    public void intit() {
        todoList.add(new Todo("t", "d"));
    }

    @GetMapping("/")
    public List<Todo> getToDoList() {
        return todoList;
    }

    @PostMapping("/todo")
    public Todo addTodo(@RequestBody Todo todo) {
        todoList.add(todo);
        return todo;
    }

    @PutMapping("/todo/{todoId}")
    public Todo editTodo(@PathVariable(name = "todoId") int todoId,
                         @RequestBody Todo todo) {
        todoList.set(todoId, todo);

        return todo;
    }

    @DeleteMapping("/todo/{todoId}")
    public String deleteTodo(@PathVariable(name = "todoId") int todoId) {
        if(todoList.isEmpty()) return "Deleted";
        todoList.remove(todoId);
        return "Deleted";
    }
}
