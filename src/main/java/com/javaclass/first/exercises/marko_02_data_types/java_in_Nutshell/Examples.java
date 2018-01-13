package com.javaclass.first.exercises.marko_02_data_types.java_in_Nutshell;

public class Examples {
    //Comments
    //
    //There is three type of comments:

    //First type comment - for single line comment
    /*
        Second type of comments - for multiline comments
     */
    /**
     * Third type of comments.
     * For Documentation of class
     */

    public static void main(String[] args) {
    //Identifiers
        int i; //single later
        int m1; //Identifier may contain numbers, but numbers can not be the first character of an identifier
        int serialNumber; //the identifier starts with a small letter
        int multiple_words_identifier; //multiple words can not contain a space, for this purpose we use the character "_"

        //Primitive Data Types:
        //boolean
        boolean b1 = true;
        boolean b2 = false;

        //char
        char letter = 'A';      //16 bits

        //Integer
        byte b= 127;                             //  8 bits -128 to 127
        short s = 32767;                         //  16 bits -32768 to 32767
        int num=2147483647;                      //  32 bits -2147483648 to 2147483647

        //Float
        float f= 1.1f; // 32 bits 1.4E-45 to 3.4028235E+38

        //Double
        double d = 1.1; // 64 bits 4.9E-324 to 1.7976931348623157E+308

        //Primitive Type Conversions
        float f1 = 311.14f;
        double d1 = (double) f1;
        int i1 = (int) d1;
        char c1 = (char) i1;
        System.out.println(f1);
        System.out.println(d1);
        System.out.println(i1);
        System.out.println(c1);

        //The Conditional Operator
        int x = (int) (Math.random() * 100);
        int y = (int) (Math.random() * 100);;
        System.out.println("Num1 = " + x);
        System.out.println("Num2 = " + y);
        int min = ( x < y) ? x : y;
        System.out.println("Min = " + min);
        System.out.println("Max = " + ((x>y) ? x:y));

        //The instanceof Operator

        Object o1 = new int[1];
        o1=3;
        System.out.println("o1 = " + o1);
        o1 = new double[1];

        if(o1 instanceof int[] ){
            o1=2;
        }else {
            o1 = 2.2;
        }
        System.out.println("o1 = " + o1);

    }
}
