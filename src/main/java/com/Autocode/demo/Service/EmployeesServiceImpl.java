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
                    p.setName(employees.getName());
                    p.setTask(employees.getTask());
                    return employeesReposetory.save(p);
                }).orElseThrow(() ->new RuntimeException("Employe non trouvé"));
    }

    @Override
    public String Supprimer(Long id) {
        employeesReposetory.deleteById(id);
        return "Produit supprimer";
    }

    public Employees getEmployeeWithTask(Long employeeId){
        return employeesReposetory.findEmployeeWithTask(employeeId);

    }
}
