package com.Autocode.demo.Controller;

import com.Autocode.demo.Modele.Employees;
import com.Autocode.demo.Service.EmployeesService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
@AllArgsConstructor
public class EmployeesController {
    private final EmployeesService employeesService;
@PostMapping("/create")
    public Employees create(@RequestBody Employees employees){
        return employeesService.creer(employees);
    }

}
