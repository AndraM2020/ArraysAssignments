package com.company;

public class Assignment2 {
    public static void main(String[] args) {
        int[] myArray = {10, 4, -4, 7, 0, 9, 1, 3, 7, -5};
        negativeElements(myArray);
        oddElements(myArray);
        sameValueElements(myArray);
        eachSecondElement(myArray);
        averageValue(myArray);

    }

    public static void negativeElements(int[] myArray) {
        System.out.println("Negative numbers: ");
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < 0)
                System.out.println(myArray[i]);
        }
    }

    public static void oddElements(int[] myArray) {
        System.out.println("Odd numbers: ");
        int oddCount = 0;

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 != 0) {
                System.out.println(myArray[i]);
                oddCount++;
            }
        }
        System.out.println("There are " + oddCount + " odd numbers");
    }

    public static void sameValueElements(int[] myArray) {

        System.out.println("Dublicate verification: ");
        boolean doEqualsExist = false;
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (myArray[i] == myArray[j]) {
                    doEqualsExist = true;
                }
            }
        }
        if (doEqualsExist) {
            System.out.println("There are elements with the same value");
        } else {
            System.out.println("There are no elements with the same value");
        }
    }

    public static void eachSecondElement(int[] myArray) {
        System.out.println("Each second element: ");
        for (int i = 1; i < myArray.length; i = i + 2) {
            System.out.println(myArray[i]);
        }
    }

    public static void averageValue(int[] myArray) {
        System.out.println("Calculating average: ");
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i];
        }
        System.out.println("Element sum is: " + sum);
        double average = sum / myArray.length;
        System.out.println("The average value of the array is: " + average);

        int smallerThanAverageCount = 0;
            for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < average) {
                System.out.println(myArray[i]);
                smallerThanAverageCount++;
            }
        }
        System.out.println("There are " + smallerThanAverageCount + " elements smaller than average (" + average + ")");
    }

}