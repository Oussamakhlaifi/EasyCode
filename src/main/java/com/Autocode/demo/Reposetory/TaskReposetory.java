package com.Autocode.demo.Reposetory;

import com.Autocode.demo.Modele.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskReposetory extends JpaRepository<Task, Long> {
}
