package com.nhi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        // take keyboard input
        Scanner input = new Scanner(System.in);
        System.out.println(input.next()); // reads 1st string
        System.out.println(input.nextLine()); // reads the whole line
    }
}
