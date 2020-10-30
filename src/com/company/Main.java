/**
 * Author: Mohahnad Albdri
 * Sub:CodeReview 1
 */

package com.company;


import java.util.Scanner;

public class Main {
    //1. Create a Java class with a main() method that can be used for running the program
    public static void main(String[] args) {
        /*2. Create a solution for the following problem: given a width and a height of a rectangular (image below, left side),
         calculate the rectangular area.
         */

        double rectangularArea = getRectangularArea(5, 2);


        /*3. Create this solution with the usage of a new Java method calculateRectArea, that returns a computed value.
         Call this method with two different sets of arguments: 20cm (width1) and 30cm (height1), as well as 40cm (width2)
         and 50cm(height2)
         */
        double a[] = {20, 30};
        double b[] = {40, 50};
        double c[] = new double[2];
        for (int i = 0; i < c.length; i++) {
            c[i] = (a[i] + b[i]) / 2;

        }
        String msg = "";
        for (double i : c) {
            msg = msg + i + "\n";
        }
        System.out.println("The new length and width is" + "\n" + msg);


        double rectangularArea1 = getRectangularArea(30, 40);
        System.out.println(" the area of new rectangular" + rectangularArea1);

        /*4. Create a solution for the following problem: given a width of a square (image below, right side),
         calculate the squareArea (on image below 16cm²)  and the squarePerimeter (Perimeter:  line forming the boundary of a closed
         geometrical figure.  Example: for a square with a width = 4cm, squarePerimeter  is 16
         cm; for a square with a width = 2cm, squarePerimeter  is 8cm)
      */

        double squareArea = getSquareArea(4);
        System.out.println("squareArea is =" + "\t" + squareArea);
        double squarePerimeter = getSquarePerimeter(4);
        System.out.println("SquarePerimeter is " + "\t" + squarePerimeter);

        //5. Demonstrate solutions from point 3 and 4 with several method calls (at least 3 for each) with different arguments.

        double l = getLength("enter length ");
        double w = getWidth("enter width");
        double manyRectangularArea = getRectangularArea(w, l);
        double ManySquareArea = getSquareArea(l);
        double manySquarePerimeter = getSquarePerimeter(l);
        System.out.println("SquarePerimeter is " + "\t" + squarePerimeter);
        System.out.println("Rectangular Area is : " + manyRectangularArea);
        System.out.println("squareArea is =" + "\t" + squareArea);
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
        double squareArea = 4 * l;
        return squareArea;
    }

}