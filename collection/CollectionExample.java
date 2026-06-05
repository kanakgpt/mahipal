package com.example.crud.collection;

import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("A");

        System.out.println(list); // [A, B, A]

        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(10);

        System.out.println(set); // [10, 20]

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Kanak");
        map.put(2, "Rahul");
        map.put(1, "Updated");

        System.out.println(map); // {1=Updated, 2=Rahul}

        // Default sorting with student name
        List<Student> students = new ArrayList<>();

        Student student1 = new Student();
        student1.setId(1);
        student1.setName("John");
        student1.setSurname("Doe");
        student1.setEmail("john.doe@example.com");
        students.add(student1);

        Student student2 = new Student();
        student2.setId(2);
        student2.setName("Alice");
        student2.setSurname("Smith");
        student2.setEmail("alice.smith@example.com");
        students.add(student2);

        Student student3 = new Student();
        student3.setId(3);
        student3.setName("Bob");
        student3.setSurname("Johnson");
        student3.setEmail("bob.johnson@example.com");
        students.add(student3);

        Student student4 = new Student();
        student4.setId(4);
        student4.setName("Emma");
        student4.setSurname("Williams");
        student4.setEmail("emma.williams@example.com");
        students.add(student4);

        Student student5 = new Student();
        student5.setId(5);
        student5.setName("Michael");
        student5.setSurname("Brown");
        student5.setEmail("michael.brown@example.com");
        students.add(student5);

        Student student6 = new Student();
        student6.setId(1);
        student6.setName("John");
        student6.setSurname("Doe");
        student6.setEmail("john.doe@example.com");
        students.add(student6);

        System.out.println("\nBefore Sorting:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Sort students by name (uses compareTo method)
        Collections.sort(students);

        System.out.println("\nAfter Sorting by Name:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
