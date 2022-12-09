package com.blz;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation");
        lengthCalc();
    }

    public static void lengthCalc() {
        int x1, x2, y1, y2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter co-ordinates for Line ");
        System.out.println("Enter co-ordinates of x1 and y1");
        x1 = sc.nextInt();
        x2 = sc.nextInt();
        System.out.println("Enter co-ordinates of x2 and y2");
        y1 = sc.nextInt();
        y2 = sc.nextInt();

        double length = Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
        System.out.println("Length of a line is " + length);
    }
}