package com.company;

import java.util.Scanner;

/*
Write a java program, which has 2 String variables, initialize them from console.
- - Compare them with == assignment
- - Compare them with equals to
*/
public class Task6 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }
}