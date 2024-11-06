package com.Autocode.demo.Reposetory;

import com.Autocode.demo.Modele.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeesReposetory extends JpaRepository<Employees,Long> {
}
