package com.blz;

import java.util.Scanner;
import java.lang.Math;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation");
        lengthCalc();
    }

    public static void lengthCalc() {
        int x1, x2, x3, x4, y1, y2, y3, y4;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter co-ordinates for Line One ");
        System.out.println("Enter co-ordinates of x1 and x2");
        x1 = sc.nextInt();
        x2 = sc.nextInt();
        System.out.println("Enter co-ordinates of y1 and y2");
        y1 = sc.nextInt();
        y2 = sc.nextInt();

        System.out.println("Enter co-ordinates for Line Two ");
        System.out.println("Enter co-ordinates of x3 and x4");
        x3 = sc.nextInt();
        x4 = sc.nextInt();
        System.out.println("Enter co-ordinates of y3 and y4");
        y3 = sc.nextInt();
        y4 = sc.nextInt();

        Double lengthOne = Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
        System.out.println("Length of a line is " + lengthOne);

        Double lengthTwo = Math.sqrt((x4 - x3) ^ 2 + (y4 - y3) ^ 2);
        System.out.println("Length of a line is " + lengthTwo);

        if(lengthOne.compareTo(lengthTwo) == 1)
            System.out.println("Length of Line 1 is GREATER than Line 2 ");
        else if (lengthOne.compareTo(lengthTwo) == -1)
            System.out.println("Length of Line 1 is LESS than Line 2 ");
        else
            System.out.println("Both lines are EQUAL in length");
        }
    }
