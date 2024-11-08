package com.Autocode.demo.Service;

import com.Autocode.demo.Modele.Task;
import com.Autocode.demo.Reposetory.TaskReposetory;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TaskServiceImpl {
   private final TaskReposetory taskReposetory;
   @Override
    public Task create (Task task){
       return taskReposetory.save(task);
   }

}
