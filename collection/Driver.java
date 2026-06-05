package com.example.crud.collection;

import java.util.*;

public class Driver {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setId(1);
        student1.setName("John");
        student1.setSurname("Doe");
        student1.setEmail("john.doe@example.com");

        Student student2 = new Student();
        student2.setId(2);
        student2.setName("Alice");
        student2.setSurname("Smith");
        student2.setEmail("alice.smith@example.com");

        Student student3 = new Student();
        student3.setId(3);
        student3.setName("Bob");
        student3.setSurname("Johnson");
        student3.setEmail("bob.johnson@example.com");

        Student student4 = new Student();
        student4.setId(4);
        student4.setName("Emma");
        student4.setSurname("Williams");
        student4.setEmail("emma.williams@example.com");

        Student student5 = new Student();
        student5.setId(5);
        student5.setName("Michael");
        student5.setSurname("Brown");
        student5.setEmail("michael.brown@example.com");

        //Generate the same hashcode for same data
        Student student6 = new Student();
        student6.setId(1);
        student6.setName("John");
        student6.setSurname("Doe");
        student6.setEmail("john.doe@example.com");

        Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        System.out.println(student1.hashCode());
        System.out.println(student6.hashCode());





        // Default sorting with student name
        //Collections.sort(students);

        System.out.println("\nAfter Sorting by Name:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
