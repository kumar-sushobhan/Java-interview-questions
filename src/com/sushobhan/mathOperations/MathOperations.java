package com.sushobhan.mathOperations;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class MathOperations {
    public static void main(String[] args) {
        List<Employee> employees = new LinkedList<>();
        employees.add(new Employee(101, "Sushobhan", 50000));
        employees.add(new Employee(102, "Kumar", 60000));
        employees.add(new Employee(103, "Mohan", 30000));
        employees.add(new Employee(104, "Amit", 20000));

        Long average = employees.stream()
                // .map(e -> e.getName().toUpperCase())
                .sorted(Comparator.comparingDouble(Employee::getSalary))
                .collect(Collectors.collectingAndThen(Collectors.averagingDouble(Employee::getSalary),
                        Math::round));
        System.out.println("Salary average : " + average);
    }
}
