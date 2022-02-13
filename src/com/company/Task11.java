package com.company;
/*
Write Java Program to check Vowel or Consonant using Switch Case.
*/
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.next().charAt(0);
        int state = 0;
        if (letter + 0 >= 65 && letter + 0 <= 90) {
            state = 1;
        }
        if (letter + 0 >= 97 && letter + 0 <= 122)
            state = 2;
        switch (state) {
            case 1:
                System.out.println(letter + " is lower letter");
                break;
            case 2:
                System.out.println(letter + " is consonant letter");
                break;
            case 0:
                System.out.println("It is not a letter");
        }
    }
}
