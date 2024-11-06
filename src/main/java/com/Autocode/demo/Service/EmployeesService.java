package com.Autocode.demo.Service;

import com.Autocode.demo.Modele.Employees;

import java.util.List;

public interface EmployeesService {
    Employees creer(Employees employees);

    List<Employees> lire();

    Employees modifier(Long id ,Employees employees);

    String Supprimer(Long id);
}
