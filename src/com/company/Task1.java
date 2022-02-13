package com.company;

import java.util.Scanner;

/*
Input integer value from console, if value greater than 0 print n positive, else
print negative.
*/
public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = n >= 0 ? "positive" : "negative";
        System.out.println(s);
    }
}
