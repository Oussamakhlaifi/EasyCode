package com.Autocode.demo.Service;

import com.Autocode.demo.Modele.Task;

public interface TaskService {
    Task create(Task task);
    void updateTaskStatuses();
}
