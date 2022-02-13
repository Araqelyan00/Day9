package com.company;
/*
If the user pressed number keys( from 0 to 9), the program will tell the number that is
pressed, otherwise, the program will show "Not allowed".
*/
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String key = scanner.next();
        switch (key) {
            case "0":
            case "1":
            case "2":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
                System.out.println("The number " + key + " is pressed");
                break;
            default:
                System.out.println("Not allowed");

        }
    }
}
