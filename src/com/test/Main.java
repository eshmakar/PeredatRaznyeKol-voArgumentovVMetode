package com.test;

public class Demo5 {
    static void differentValues(int value, String... s) {
        System.out.print(value);
        for (String x : s) {
            System.out.print(", " + x);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        differentValues(45,"forty five", "owe");
        differentValues(66);
    }
}