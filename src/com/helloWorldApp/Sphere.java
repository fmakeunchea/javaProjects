package com.helloWorldApp;

import java.util.Scanner;

public class Sphere
{
    public static void main(String[] args)
    {
        Scanner fifi = new Scanner(System.in);

        System.out.println("Enter Radius of a sphere ");
        double radius = fifi.nextDouble();

        System.out.printf("Volume is: %f%n", sphereVolume(radius));
    }
    //calculate and return volume
    public static double sphereVolume(double radius)
    {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        return volume;
    }
}
