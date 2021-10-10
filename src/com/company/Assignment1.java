package com.company;

public class Assignment1 {

    public static void main(String[] args) {
        int[] myArray = {5, 3, 7, 6, 2, 8};
        forLoop(myArray);
        forEachLoop(myArray);
        whileLoop(myArray);
        doWhileLoop(myArray);
    }


    public static void forLoop(int[] myArray) {
        for (int i = 0; i < myArray.length; i++)
            System.out.println(myArray[i]);
    }

    public static void forEachLoop(int[] myArray) { //this one seemed to be the best for the assignment
        for (int checkAll : myArray)
            System.out.println(checkAll);
    }

    public static void whileLoop(int[] myArray) {
        int i = 0;
        while (i < myArray.length) {
            System.out.println(myArray[i]);
            i++;
        }
    }

    public static void doWhileLoop(int[] myArray) {
        int i = 0;
        do {
            System.out.println(myArray[i]);
            i++;
        }
        while (i < myArray.length);
    }
}










