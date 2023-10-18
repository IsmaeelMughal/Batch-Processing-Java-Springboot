package com.example.batch.component;

import com.example.batch.entity.Employee;
import org.springframework.batch.item.ItemProcessor;

public class EmployeeProcessor implements ItemProcessor<Employee, Employee> {
    @Override
    public Employee process(Employee employee) throws Exception {
        long salary = employee.getSalary();

        if(salary>=50000)
        {
            return employee;
        }
        return null;
    }
}
