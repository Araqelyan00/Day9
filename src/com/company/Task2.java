package com.company;

import java.util.Scanner;

/*
Input integer value from console, if value greater than 0 print n positive, else
print negative.
*/
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n > 0){
            System.out.println("positive");
        }else if (n == 0){
            System.out.println("0");
        }else System.out.println("negative");
    }
}
