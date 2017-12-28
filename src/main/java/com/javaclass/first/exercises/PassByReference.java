package com.javaclass.first.exercises;

public class PassByReference {
    private int size;
    public static void main(String[] args) {
        PassByReference pass = new PassByReference(5);
        System.out.println("Java uses pass by value.But,");
        System.out.println("When an object is passed as argument to a method, actually the reference to that object is passed.");
        System.out.println("Size before change: " + pass.size);
        change(pass);
        System.out.println("Size after change: " + pass.size);
    }

    private static void change(PassByReference byReference){
        byReference.setSize(100);
    }

    private PassByReference(int size) {
        this.size = size;
    }

    private void setSize(int size) {
        this.size = size;
    }
}
