package com.Autocode.demo.Reposetory;

import com.Autocode.demo.Modele.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EmployeesReposetory extends JpaRepository<Employees,Long> {
    @Query("SELECT e FROM Employees e JOIN FETCH e.Task WHERE e.id= :employeesId")
    Employees findEmployeeWithTask(@Param("employeeId") Long employeeId);
}
