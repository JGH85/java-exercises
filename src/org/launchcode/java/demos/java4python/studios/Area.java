package org.launchcode.java.demos.java4python.studios;

import java.util.Scanner;

/**
 * Created by Joseph on 2/27/2017.
 */
public class Area {
    public static void main(String[] args){
        Scanner scanner;
        scanner = new Scanner(System.in);
        Double PI = 3.14;
        Double radius = 0.0;

        System.out.println("Enter a radius:");
        radius = scanner.nextDouble();

        Double area = PI * radius * radius;

        System.out.println("The area is: " + area);


    }
}
