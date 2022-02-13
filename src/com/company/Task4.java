package com.company;

import java.util.Scanner;

/*
Write a Java program that allows the user to choose the correct answer of a question.If
he choose correct answer Print “Congratulation”,
in case of illegal choice print “Invalid choice”.
*/
public class Task4 {
    public static void main(String[] args) {
        System.out.print("What is the correct way to declare a variable \nto store an integer value in Java? \n" +
                "(1) int 1x=10;\n" +
                "(2) int x = 10;\n" +
                "(3) float x=10.0f;\n" +
                "(4) string x=\"10\";\n" +
                "Choose an answer : ");
        Scanner scanner = new Scanner(System.in);
        int i= scanner.nextInt();
        switch(i)
        {
            case 1:
            case 3:
            case 4:
                System.out.println("Invalid choice");
                break;
            case 2:
                System.out.println("Congratulation");
                break;
            default:
                System.out.println("Default");
        }
    }
    }

