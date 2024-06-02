package com.sushobhan;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NthHighestSalary {
    public static void main(String[] args) {
        Map<String, Integer> employeeSalary = new HashMap<>();
        employeeSalary.put("Sushobhan1", 1000);
        employeeSalary.put("Sushobhan2", 5000);
        employeeSalary.put("Sushobhan3", 3000);
        employeeSalary.put("Sushobhan4", 2000);
        employeeSalary.put("Sushobhan5", 2000);
        employeeSalary.put("Sushobhan6", 5000);
        employeeSalary.put("Sushobhan7", 1000);
        employeeSalary.put("Sushobhan8", 7000);
        employeeSalary.put("Sushobhan9", 8000);
        employeeSalary.put("Sushobhan10", 9000);

        System.out.println("3rd highest salary : " + getNthSalaryUpdated(employeeSalary, 1));
        System.out.println("3rd highest salary without grouping : " + getNthSalaryUpdated(employeeSalary, 1));
        System.out.println("Average salary : " + findAverage(employeeSalary));
    }

    private static Map.Entry<String, Integer> getNthSalary(Map<String, Integer> employeeMap, int number) {
        return employeeMap.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .toList()
                .get(number - 1);
    }

    private static Map.Entry<Integer, List<String>> getNthSalaryUpdated(Map<String, Integer> employeeSalary, int number) {
        return employeeSalary.entrySet()
                .stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .toList()
                .get(number - 1);
    }

    private static double findAverage(Map<String, Integer> employeeMap) {
        return employeeMap.entrySet()
                .stream()
                .map(Map.Entry::getValue)
                .mapToInt(Integer::intValue)
                .summaryStatistics()
                .getAverage();
    }
}
