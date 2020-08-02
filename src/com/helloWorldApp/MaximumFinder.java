package com.helloWorldApp;

import java.util.Scanner;

public class MaximumFinder {
    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);

        //prompt for an input three floating-point values
        System.out.print("Enter three floating-point values separated by spaces: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        //determine the max value
        double result = maximum(number1, number2, number3);

        //display max value
        System.out.println("Maximun is: " + result);
    }
        //returns the maximum of its three double parameters
        public static double maximum(double x, double y, double z)
        {
            double maxValue = x; //assume x is the largest to start with

            //determine whether y is greater than maxValue
            if (y > maxValue)
                maxValue = y;

            //determine whether z is greater than maxValue
            if (z > maxValue)
                maxValue = z;
            return maxValue;

    }
}
