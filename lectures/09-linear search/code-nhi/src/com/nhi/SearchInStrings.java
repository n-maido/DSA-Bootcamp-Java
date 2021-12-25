package com.nhi;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Nhi";
        char target = 'i';
        System.out.println(search(name, target));
        System.out.println(search2(name, target));
    }

    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        // shortcut: fori
        for (int i = 0; i < str.length(); i++) {
            // charAt() returns the char at a particular index
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    static boolean search2(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        // using a for-each loop
        for (char ch: str.toCharArray()) {
            // charAt() returns the char at a particular index
            if (ch == target) {
                return true;
            }
        }
        return false;
    }
}
