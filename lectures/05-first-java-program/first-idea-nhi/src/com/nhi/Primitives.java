package com.nhi;

public class Primitives {
    public static void main(String[] args) {
        int rollNo = 64; // 4 bytes
        char letter = 'n'; // single quotes, 8 bytes
        float marks = 98.67f; // need to end floats w/ an f, 4 bytes
        double largeDecimals = 456789.456789; // 8 bytes
        long largeInt = 1234567890567898766L; // end w L, 8 bytes
        boolean check = true;

        // String is not primitive
        String name = "Nhi";

        // we can create objects of Integer
        // (a wrapper class; provides additional functionalities)
        Integer rno = 64;

        // You can express large numbers with underscores, where we'd usually put commas
        int mil = 1_000_000;
    }
}
