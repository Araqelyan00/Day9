package com.company;

import java.util.Scanner;

/*
Using ternary operator check if the given String
- - is a null so return -1
- - if given String is “ ” return 0
- - else return 1
*/
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int n = str == null ? -1 : 1 ;
        n = str == " " ? 0 : 1;
        System.out.println(n);
    }
}
