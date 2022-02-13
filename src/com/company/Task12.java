package com.company;

import java.util.Scanner;

/*
Given the String variable day holding the name of the weekday Sunday, Monday, etc., set an int variable to 1, 2,
etc.
*/
public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String weekday = scanner.next();
        switch (weekday) {

            case ("Monday"):
                System.out.println("1");
            case ("Tuesday"):
                System.out.println("2");
            case ("Wednesday"):
                System.out.println("3");
            case ("Thursday"):
                System.out.println("4");
            case ("Friday"):
                System.out.println("5");
            case ("Saturday"):
                System.out.println("6");
            case ("Sunday"):
                System.out.println("7");
            default:
                System.out.println("0");
        }
    }
}
