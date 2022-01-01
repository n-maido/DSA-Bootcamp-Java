package com.nhi;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // type casting
        int num = (int)(67.56f);

        // automatic type promotion in expressions
        int a = 257;
        byte b = (byte)a; // 257 % 256 = 1

        // Notice that it prints 1 instead of 257.
        // max val of byte is 256
        // 1 is the remainder
        System.out.println(b);

        byte x = 40;
        byte y = 50;
        byte z = 100;
        // java auto converts x,y,z into ints so they can be stored
        int d = (x * y) / z;
        System.out.println(d);

        byte w = 50;
        // this will give an error, bc w is now an int
        //w = w * 2;

        int number = 'A';
        // this prints the ascii val
        System.out.println(number);

        byte b1 = 42;
        char c1 = 'a';
        short s1 = 1024;
        int i1 = 50_000;
        float f1 = 5.67f;
        double d1 = 0.1234;
        // go through each op by hand and see how it converts
        // smaller gets converted to the larger type
        double result = (f1 * b1) + (i1 / c1) - (d1 * s1);
        System.out.println((f1 * b1) +  " " + (i1 / c1) + "" + (d1 * s1));
        // float + int - double = double
        System.out.println(result);

    }
}
