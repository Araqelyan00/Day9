package com.company;

import java.util.Scanner;

/*
Write a java program to find maximum from a given 3 integer numbers using ternary
operator.Input numbers from console.
*/
public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
            int max = num1 > num2 ? num1 : num2;
            int maximum = max > num3 ? max : num3;
        System.out.println(maximum);
    }
}
