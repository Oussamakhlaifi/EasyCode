package com.Autocode.demo.Controller;

import com.Autocode.demo.Modele.Employees;
import com.Autocode.demo.Service.EmployeesService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
@AllArgsConstructor
public class EmployeesController {
    private final EmployeesService employeesService;
@PostMapping("/create")
    public Employees create(@RequestBody Employees employees){
        return employeesService.creer(employees);
    }
    @GetMapping("/read")
    public List<Employees> read(){
    return  employeesService.lire();
    }
    @PutMapping("/update/{id}")
    public Employees update(@PathVariable Long id,@RequestBody Employees employees) {
    return employeesService.modifier(id, employees);
    }
    @DeleteMapping("/delete/{id}")
public String delete(@PathVariable Long id){
    return employeesService.Supprimer(id);
}
}
