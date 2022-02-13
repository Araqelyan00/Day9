package com.company;
/*
Write a java program, which has 2 String variables, initialize them, One with literal,
another using new keyword
- - Compare them with == assignment
- - Compare them with equals to
*/
public class Task7 {
    public static void main(String[] args) {
        String str1 = "text";
        String str2 = new String("text");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }
}
