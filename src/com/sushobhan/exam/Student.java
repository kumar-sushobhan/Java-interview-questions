package com.sushobhan.exam;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Student implements Comparable<Student>{
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        return Integer.compare(this.id, student.getId());
    }

    public static void main(String[] args) {
        List<Student> students = new LinkedList<>();
        Student student1 = new Student(101, "Sushobhan");
        Student student2 = new Student(109, "Mohan");
        Student student3 = new Student(107, "Amit");
        Student student4 = new Student(104, "Sohan");
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        //Collections.sort(students);
        Collections.sort(students, new NameComparator());
        System.out.println(students);

        System.out.println("----------------------------------");
        List<Student> sortedListOnName = students.stream()
                //.sorted(Comparator.comparing(Student::getName))
                .sorted(Collections.reverseOrder(Comparator.comparing(Student::getName)))
                .toList();
        System.out.println("Sort on name : " + sortedListOnName);
    }
}
