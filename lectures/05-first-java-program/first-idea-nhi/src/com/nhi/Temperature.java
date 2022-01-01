package com.nhi;

import java.util.Scanner;

/**
 * Converts C to F
 */
public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a temp in C: ");
        float tempC = input.nextFloat();

        float tempF = (tempC * 9/5) + 32;

        System.out.println(tempF);
    }
}
