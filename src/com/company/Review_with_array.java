package com.company; /**
 * Author: Mohahnad Albdri
 * Sub:CodeReview 1
 */


import java.util.Scanner;

public class Review_with_array {


    //1. Create a Java class with a main() method that can be used for running the program
    public static void main(String[] args) {
        /*2. Create a solution for the following problem: given a width and a height of a rectangular (image below, left side),
         calculate the rectangular area.
         */

        double rectangularArea = getRectangularArea(500, 200);

        System.out.println("The rectangularArea is: " + rectangularArea + "cm");

        /*3. Create this solution with the usage of a new Java method calculateRectArea, that returns a computed value.
         Call this method with two different sets of arguments: 20cm (width1) and 30cm (height1), as well as 40cm (width2)
         and 50cm(height2)
         */


        double array1[] = {20, 30};
        double array2[] = {40, 50};

        double rectangularAreaResult1 = getRectangularAreaByArray(array1);
        System.out.println(" the area of new rectangular [1]: " + rectangularAreaResult1);

        double rectangularAreaResult2 = getRectangularAreaByArray(array2);
        System.out.println(" the area of new rectangular [2]: " + rectangularAreaResult2+ "cm");






        /*4. Create a solution for the following problem: given a width of a square (image below, right side),
         calculate the squareArea (on image below 16cm²)  and the squarePerimeter (Perimeter:  line forming the boundary of a closed
         geometrical figure.  Example: for a square with a width = 4cm, squarePerimeter  is 16
         cm; for a square with a width = 2cm, squarePerimeter  is 8cm)
      */

        double squareArea = getSquareArea(400);
        System.out.println("squareArea is =" + "\t" + squareArea+ "cm");
        double squarePerimeter = getSquarePerimeter(400);
        System.out.println("SquarePerimeter is " + "\t" + squarePerimeter+ "cm");

        //5. Demonstrate solutions from point 3 and 4 with several method calls (at least 3 for each) with different arguments.

        double l = getLength("enter length ");
        double w = getWidth("enter width");
        double manyRectangularArea = getRectangularArea(w, l);
        double ManySquareArea = getSquareArea(l);
        double manySquarePerimeter = getSquarePerimeter(l);
        System.out.println("SquarePerimeter is " + "\t" + squarePerimeter+ "cm");
        System.out.println("Rectangular Area is : " + manyRectangularArea+ "cm");
        System.out.println("squareArea is =" + "\t" + squareArea+ "cm");

        //Bonus points
        //1
        double [] arr=new double[2];
        Scanner scanner=new Scanner(System.in);
        for (int j = 0; j < arr.length; j++) {
            System.out.println("enter the number");
            arr[j]=scanner.nextDouble();
        }

        double res= 0;
        for (int i = 0; i < arr.length; i++) {
            res=res+(arr[0]*arr[1]);

            System.out.println(res);
            break;
        }
        //2

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

    public static double getRectangularAreaByArray(double arrayDimensions[]) {


        return arrayDimensions[0] * arrayDimensions[1];
    }

}
