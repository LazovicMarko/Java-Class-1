package com.javaclass.first.exercises.marko_02_data_types.pass_by_value;

public class PassByValue {


    public static void main(String[] args) {
        Integer i1 = 5;
        Integer i2 = 3;
        Integer i3 = i1;
        Integer i4 = i2;

        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);
        System.out.println("i4 = " + i4);
        System.out.println("---------------------------------------");

        i1 = i4;
        i3 = 1;
        i4 = 7;

        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);
        System.out.println("i4 = " + i4);
        System.out.println("---------------------------------------");
        
        i2 = 9;
        i1 = 2;

        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);
        System.out.println("i4 = " + i4);
        System.out.println("---------------------------------------");
        System.out.println("***Even if one object points to another object, \n" +
                "   changing one object will not be reflected on the other. \n" +
                "   This is because primitive data types do not point to the same reference.");

    }


}
