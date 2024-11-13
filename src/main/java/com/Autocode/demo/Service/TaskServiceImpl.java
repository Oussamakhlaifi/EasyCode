package com.Autocode.demo.Service;

import com.Autocode.demo.Modele.Task;
import com.Autocode.demo.Reposetory.TaskReposetory;
import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@AllArgsConstructor
public class TaskServiceImpl implements TaskService {
    private final TaskReposetory taskRepository;

    @Override
    public Task create(Task task) {
        if(task.getStatus() == null){
            task.setStatus(Task.Status.NOT_STARTED);
        }
        return taskRepository.save(task);
    }
    @Override
    @Scheduled(cron = "0 0 0 * * ?")
    public void updateTaskStatuses() {
        List<Task> tasks = taskRepository.findAll();
        for(Task task :tasks) {
            LocalDate today = LocalDate.now();
            if(today.isBefore(task.getStartDate())){
                task.setStatus(Task.Status.NOT_STARTED);
            } else if (today.isAfter(task.getEndDate())) {
                task.setStatus(Task.Status.FINISHED);
            }else {
                task.setStatus(Task.Status.IN_PROGRESS);
            }
            taskRepository.save(task);
        }
    }
}
