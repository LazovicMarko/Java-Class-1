package com.javaclass.first.exercises.marko_02_data_types.java_in_Nutshell;

import java.util.ArrayList;
import java.util.List;

public class BoxingAndUnboxing {
    public static void main(String[] args) {
        //Example 1: Boxing
        double d1 = 5.5;
        Double d2 = new Double(d1);

        //Example 2: Autoboxing (int to Integer)
        Integer i = 5;

        //Example 3: Autoboxing (int to Integer)
        List<Integer> numbers1 = new ArrayList<>();
        for (int x = 1; i < 10; i ++) {              //The compiler creates an Integer object from i
            numbers1.add(i);                         //and adds the object to numbers1.
        }
        //The same thing,
        //This is how the compiler did it.
        List<Integer> numbers2 = new ArrayList<>();
        for (int x = 1; i < 10; i++) {
            numbers2.add(Integer.valueOf(i));
        }

        //Example 4: Unboxing
        double d3 = d2.doubleValue();
    }
}
