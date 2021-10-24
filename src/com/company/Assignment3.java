package com.company;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        byte[] gradeArray = new byte[10];
        byte numberOfGradesEntered = 0;
        byte grade = 0;
        byte failedStudentCount = 0;
        byte gradeAStudentCount = 0;

        Scanner input = new Scanner(System.in);

        while (numberOfGradesEntered < 10) {
            System.out.println("Please enter a grade: ");
            grade = input.nextByte();
            if (grade < 0 || grade > 10) {
                System.out.println("Please enter a valid grade (0 to 10)");
            } else {
                gradeArray[numberOfGradesEntered] = grade;
                numberOfGradesEntered++;
            }
        }
        for (int i = 0; i < gradeArray.length; i++) {
            if (gradeArray[i] < 4)
                failedStudentCount++;

            if (gradeArray[i] == 10)

                gradeAStudentCount++;
        }
        System.out.println("The number of students failed: " + failedStudentCount);
        System.out.println("The number of A grade students: " + gradeAStudentCount);

        //histogram
        byte gradeCounter = 0;
        for (int gradeToCheck = 0; gradeToCheck <= 10; gradeToCheck++) {
            gradeCounter = 0;
            for (int i = 0; i < gradeArray.length; i++) {
                if (gradeArray[i] == gradeToCheck) {
                    gradeCounter++;
                }
            }
            System.out.println(gradeCounter + " students got grade " + gradeToCheck + ".");
        }
    }
}
