package com.syntax.review1;

import java.sql.SQLOutput;

public class WorkingWithVariables {
    public static void main(String[] args) {
        // create a variable and store value to it
        // decalred a variable and we initialized it

        int number = 10;

        // declared a variable
        int num;// declaration of variable happens only once
        num = 100;//initialized the variable
        num = 200;//reassign the value;
        System.out.println(num);//200

        boolean hungry = false;
        hungry = true;

        // Strung is the most popular data type we going to use
        String myString = "Hello";

        String name = "Asel";
        String addres = "123 Test drive";

        System.out.println(myString + " " + name);
        int age = 21;
        System.out.println(name + " is " + (age) + " years old");
        /*
        if we want to attach String to anythin:
        String to String
        string to int
        string to boolean
        string to char....
        we use +
         */
        System.out.println(number + num);

        String n1 = "10";
        System.out.println(n1 + num);

        String month = "December";
        int day = 14;
        System.out.println(day + " " + month);

        char date = '1';
        System.out.println(date + month);

        System.out.println(date+day);

    }
}
