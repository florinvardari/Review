package com.syntax.review4;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        int a=1;
        while (a<=3){
            System.out.println("I am a while loop");
            a++;
        }
        /// when we do not know how many times we need to repeat block of code
        // while or do while0
        int b=1;
        do {
            System.out.println("do while");
        }while (b>=3);


        Scanner scan=new Scanner(System.in);
        String answer;
        do {
            System.out.println("Do you understand loops in Java?");
             answer = scan.nextLine();
        }while (!answer.equalsIgnoreCase("yes"));
        System.out.println("Great jobs lets learn arrays");



    }
}
