package com.Autocode.demo.Controller;

import com.Autocode.demo.Modele.Task;
import com.Autocode.demo.Service.TaskService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Task")
@AllArgsConstructor
public class TaskController {
    private final TaskService taskService;

    @PostMapping("/create")
    public Task create (@RequestBody Task task){
        return taskService.create(task);
    }

}