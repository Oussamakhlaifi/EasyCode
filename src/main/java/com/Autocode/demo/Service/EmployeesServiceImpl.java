package com.Autocode.demo.Service;

import com.Autocode.demo.Modele.Employees;
import com.Autocode.demo.Reposetory.EmployeesReposetory;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class EmployeesServiceImpl implements EmployeesService{

    private final EmployeesReposetory employeesReposetory;
    @Override
    public Employees creer(Employees employees) {
        return employeesReposetory.save(employees);
    }

    @Override
    public List<Employees> lire() {
        return employeesReposetory.findAll();
    }

    @Override
    public Employees modifier(Long id, Employees employees) {
        return employeesReposetory.findById(id)
                .map(p->{
                    return employeesReposetory.save(p)
                })
    }

    @Override
    public String Supprimer(Long id) {
        return "";
    }
}
