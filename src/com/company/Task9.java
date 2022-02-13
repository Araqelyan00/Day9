package com.company;

import java.util.Scanner;

/*
Using switch statements determine if the number is even or odd.
Input number from console
*/
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch (number % 2){
            case 0: System.out.println("even");
                break;
            case 1: System.out.println("odd");
                break;
        }
    }
}
