package com.syntax.review5;

public class TwoDArrayReview {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {11, 12, 13},
                {20, 21, 22},
                {100,101}};

        /// getting all the values from 2D array
        







        int numberOfArrays= array.length;
        System.out.println(array.length);

        int numberOfElementsin1Array=array[0].length;
        System.out.println(numberOfElementsin1Array);

        int numberOfElementsin4Array=array[3].length;
        System.out.println(numberOfElementsin4Array);

// access 21
        System.out.println(array[2][1]);
    }


}

