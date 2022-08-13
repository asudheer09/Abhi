package com.example.datatypes;

public class WeightTest {

    public static void main(String[] args) {
        double weight=60.5;
        int age=24;
        // if weight >50 and age <25 then eligible for exam
        if(weight>=50){ // true
            if(age<25){ //true
                System.out.println("Eligible for an exam");
            }
            System.out.println("this is from first if condition");
        }
    }
}
