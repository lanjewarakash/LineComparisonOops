package com.blz;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Wel Come To Line Comparison Computation");
        LengthInputs input = new LengthInputs();
        input.lengthInput();
        LengthCalculate cal = new LengthCalculate();
        cal.lengthCal();
        CompareLength compare = new CompareLength();
        compare.compareTwoLength();

    }
}

class LengthInputs {
    public static int x1, x2, y1, y2, x3, x4, y3, y4;

    public void lengthInput() {
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

    }
}

class LengthCalculate {
    static Double lengthOne, lengthTwo;

    public void lengthCal() {
        Double lengthOne = Math.sqrt((LengthInputs.x2 - LengthInputs.x1) ^ 2 + (LengthInputs.y2 - LengthInputs.y1) ^ 2);
        System.out.println("Length of a line is " + lengthOne);

        Double lengthTwo = Math.sqrt((LengthInputs.x4 - LengthInputs.x3) ^ 2 + (LengthInputs.y4 - LengthInputs.y3) ^ 2);
        System.out.println("Length of a line is " + lengthTwo);
    }
}

class CompareLength {
    public void compareTwoLength() {
        if (LengthCalculate.lengthOne.compareTo(LengthCalculate.lengthTwo) == 1) {
            System.out.println("Line1 is greater than line2 in length");
        } else if (LengthCalculate.lengthOne.compareTo(LengthCalculate.lengthTwo) == -1) {
            System.out.println("Line1 is less than line2 in length");
        } else {
            System.out.println("Both lines are EQUAL in length");
        }
    }
}