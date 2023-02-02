package com.contratos.modules.employee.services;

import com.contratos.modules.employee.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public <S extends Employee> S save(S entity) {
        return employeeRepository.save(entity);
    }

    public Optional<Employee> findById(Long id) {
        return employeeRepository.findById(id);
    }

    public void deleteById(Long aLong) {
        employeeRepository.deleteById(aLong);
    }
}
