package com.example.batch.component;

import com.example.batch.entity.Employee;
import com.example.batch.repository.EmployeeRepository;
import org.springframework.batch.item.Chunk;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeWriter implements ItemWriter<Employee> {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void write(Chunk<? extends Employee> chunk) throws Exception {
        System.out.println("Thread name : " + Thread.currentThread().getName());
        employeeRepository.saveAll(chunk.getItems());
    }
}
