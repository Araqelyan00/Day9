package com.company;

import java.util.Scanner;

/*
Program to make a calculator using switch case in Java
In this Program we are making a simple calculator that performs addition, subtraction, multiplication and
division based on the user input. The program takes the value of both the numbers (entered by user) and
then user is asked to enter the operation (+, -, * and /), based on the input program performs the selected
operation on the entered numbers using switch case.
*/
public class Task10 {
    public static void main(String[] args) {
        System.out.print("Please input operation \n" +
                "Example` \n" +
                "1 + 2 \n" +
                "Operation : " );
    Scanner scanner = new Scanner(System.in);
    int num1 = scanner.nextInt();
    String operator = scanner.next();
    int num2 = scanner.nextInt();
    switch (operator){
        case "+":
            System.out.println(num1 + num2);
            break;
        case "-":
            System.out.println(num1 - num2);
            break;
        case "*":
            System.out.println(num1 * num2);
            break;
        case "/":
            System.out.println(num1 / num2);
            break;
        default:
            System.out.println("Try again. You have done smth. wrong.");
    }
}
}