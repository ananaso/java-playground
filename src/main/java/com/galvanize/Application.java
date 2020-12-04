package com.galvanize;

// Learn - Classes: Java Object Model
// class User implements Comparable, Cloneable {}
// class Employee extends User {}
// class Manager extends Employee {}
// class Customer extends User {}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Application {
    java.time.LocalDateTime now = java.time.LocalDateTime.now();

    // Learn - Data Structures and Algorithms: The Accumulator Pattern
    public static String toSentence(String[] strings) {
        // 3: Solving an accumulator problem
        String outStr = "";

        if (strings.length == 0 || (strings.length == 1 && strings[0].equals(""))) {
            return outStr;
        }

        for (int i = 0; i < strings.length; i++) {
            String str = strings[i];
            String delimeter = ", ";
            if (i == strings.length - 1) {
                delimeter = " and ";
            }
            if (i == 0) {
                outStr = str;
            } else {
                outStr = String.join(delimeter, outStr, str);
            }
        }

        return outStr;
    }

    // Learn - Data Structures and Algorithms: HashMaps
    public HashMap<Integer, String> genHashMap() {
        // 5: Basic Operations with HashMap
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(747, "Airplane");
        hm.put(10, "Laphroaig");
        return hm;
    }

    // Learn - Data Structures and Algorithms: Arrays and Lists
    public ArrayList<String> sortArray(String[] inputArray) {
        // 3: Basic Operations with ArrayLists
        ArrayList<String> newArr = new ArrayList<>(Arrays.asList(inputArray));
        newArr.sort(null);
        return newArr;
    }


    // Learn - Classes: Java Object Model
//    public boolean isEmployee(Object o) {
//        return o instanceof Employee;
//    }
//    public boolean isManager(Object o) {
//        return o instanceof Manager;
//    }
//    public boolean isCustomer(Object o) {
//        return o instanceof Customer;
//    }
//    public boolean isComparable(Object o) {
//        return o instanceof Comparable;
//    }

    // Learn - Classes: Instance Methods
    private int bar;
    private void foo(int baz) {
        // #1: Modifying Internal State
        this.bar += baz;
    }
    public int bar() {
        // #2: Returning Internal State
        return this.bar * 20;
    }

    public static void usingAForLoop() {
        for (int x = 2; x <= 6; x += 2) {
            System.out.println(x);
        }
    }

    public static void usingAWhileLoop() {
        int x = 45;
        while (x <= 50) {
            System.out.println(x);
            x++;
        }
    }

    public static String grade(int input) {
        if (input >= 90) {
            return "A";
        } else if (input >= 80) {
            return "B";
        } else if (input >= 70) {
            return "C";
        } else if (input >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static boolean isActive(String status) {
        return status.equals("active");
    }

    public static void variables_1() {
        String helloWorld = "Hello World";

        System.out.println(helloWorld);
    }

    public static void main(String[] args) {
//        variables_1();  // Hello World
//        System.out.println(isActive("active")); // true
//        System.out.println(isActive("hello"));  // false
//        System.out.println(grade(95));  // A
//        System.out.println(grade(37));  // F
//        usingAWhileLoop();  // 45, 46, 47, 48, 49, 50
//        usingAForLoop();    // 2, 4, 6
//        if (args.length < 1) {
//            System.out.println("Please provide an argument");
//        } else {
//            System.out.println(String.format("Argument provided: %s", args[0]));
//        }

        // 3: Solving an accumulator problem
        String[] str1 = {""};
        String[] str2 = {};
        String[] str3 = {"Alice", "Bob"};
        String[] str4 = {"Alice", "Bob", "Carol"};
        ArrayList<String[]> strings = new ArrayList<>(Arrays.asList(str1, str2, str3, str4));
        ArrayList<String> outStr = new ArrayList<>();
        strings.forEach((strArr) -> outStr.add(toSentence(strArr)));
        System.out.println(outStr);
    }
}
