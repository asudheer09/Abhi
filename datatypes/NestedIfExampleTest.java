package com.example.datatypes;

public class NestedIfExampleTest {

    public static void main(String[] args) {

        int n = 130;
        if (n >= 125) { // 123>=125 false
            if (n == 127) {
                System.out.println("n is equal to 127");
            } else {
                System.out.println("n is not equal to 127");
            }
        } else {
            System.out.println("n is less than 125");
        }

    }
}
