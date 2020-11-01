package com.company;

import java.util.Scanner;

public class Test_with_if_and_else {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Area Calculator:" + "\n" +
                " Enter 1 to find the area of a Rectangle, Enter 2 to find the area of a Square, Enter 3 to find the perimeter of Square");

        int userInput = Integer.parseInt(scanner.next());

        if (userInput == 1) {
            System.out.println("Please enter the length of the rectangle: ");
            int length = Integer.parseInt(scanner.next());
            System.out.println("Please enter the width of the rectangle: ");
            int width = Integer.parseInt(scanner.next());

            System.out.println("The area of a Rectangle is" + "\t" +getRectangularArea(length,width));
        } else if (userInput == 2) {
            System.out.println("Please enter the length of a side: ");
            int lengthOfASide = Integer.parseInt(scanner.next());

            System.out.println("The area of a Square is " + "\t" + getSquareArea(lengthOfASide));
        } else if (userInput == 3) {
            System.out.println("Please enter the length of a side: ");
            int lengthOfASide = Integer.parseInt(scanner.next());

            System.out.println("The perimeter of Square is:" + "\t" +getSquarePerimeter(lengthOfASide));


        }
    }

    public static double getLength(String msg) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter length ");
        double l = s.nextDouble();
        return l;
    }

    public static double getWidth(String msg) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter length ");
        double w = s.nextDouble();
        return w;
    }

    public static double getRectangularArea(double l, double w) {
        double rectangularArea = l * w;
        return rectangularArea;
    }

    public static double getRectangularPerimeter(double l, double w) {
        double rectangularPerimeter = 2 * (l + w);
        return rectangularPerimeter;
    }

    public static double getSquareArea(double l) {
        double squareArea = l * l;
        return squareArea;
    }

    public static double getSquarePerimeter(double l) {
        double squarePerimeter = 4 * l;
        return squarePerimeter;
    }
    }

