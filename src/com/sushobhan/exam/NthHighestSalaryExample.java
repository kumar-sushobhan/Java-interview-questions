package com.sushobhan.exam;

import java.util.*;
import java.util.stream.Collectors;

public class NthHighestSalaryExample {

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

            System.out.println("3rd highest salary : " + getNthSalaryExample(employeeSalary, 1));
            System.out.println(employeeSalary.entrySet()
                    .stream().collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey, Collectors.toList()))));
        }

    private static Map.Entry<Integer, List<String>> getNthSalaryExample(Map<String, Integer> employeeSalary, int i) {
        return employeeSalary.entrySet()
                .stream().collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .toList()
                .get(i-1);
    }
}
