package com.company;

public class Main {

    public static void main(String[] args) {
        Salary s1 = new Salary("Em1", 7.50, 35);
        Salary s2 = new Salary("Em2", 8.20, 47);
        Salary s3 = new Salary("Em3", 10.00, 73);

        System.out.println(s1.calculateSalary());
        System.out.println(s2.calculateSalary());
        System.out.println(s3.calculateSalary());

    }
}


