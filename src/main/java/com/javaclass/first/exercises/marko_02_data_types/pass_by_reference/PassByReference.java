package com.javaclass.first.exercises.marko_02_data_types.pass_by_reference;

public class PassByReference {
    public static void main(String[] args){
        Vehicle vehicle1 = new Car("BMW M2","Car","Diesel",4,2,4);
        Vehicle vehicle2 = new Motorcycle("Kawasaki Ninja","Motorcycle", "gasoline",2,"25 kmpl");
        Vehicle vehicle3 = vehicle1;
        Vehicle vehicle4 = vehicle3;

        System.out.println("Vehicle 1 :"  + vehicle1.toString());
        System.out.println("Vehicle 1 hashCode: " + Integer.toHexString(vehicle1.hashCode()));
        System.out.println("Vehicle 2 :"  + vehicle2.toString());
        System.out.println("Vehicle 2 hashCode: " + Integer.toHexString(vehicle2.hashCode()));
        System.out.println("Vehicle 3 :"  + vehicle3.toString());
        System.out.println("Vehicle 3 hashCode: " + Integer.toHexString(vehicle3.hashCode()));
        System.out.println("Vehicle 4 :"  + vehicle4.toString());
        System.out.println("Vehicle 4 hashCode: " + Integer.toHexString(vehicle4.hashCode()));
        System.out.println("-------------------------------------------------------------------------");

        System.out.println("***Even if we change only one object, \n" +
                "       all other objects will be the same. \n " +
                "       This is because all objects point to the same reference.");

        vehicle4=vehicle2;
        vehicle2.setName("Suzuki GSX");
        vehicle1=vehicle4;
        vehicle2 = vehicle3;

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Vehicle 1 :"  + vehicle1.toString());
        System.out.println("Vehicle 1 hashCode: " + Integer.toHexString(vehicle1.hashCode()));
        System.out.println("Vehicle 2 :"  + vehicle2.toString());
        System.out.println("Vehicle 2 hashCode: " + Integer.toHexString(vehicle2.hashCode()));
        System.out.println("Vehicle 3 :"  + vehicle3.toString());
        System.out.println("Vehicle 3 hashCode: " + Integer.toHexString(vehicle3.hashCode()));
        System.out.println("Vehicle 4 :"  + vehicle4.toString());
        System.out.println("Vehicle 4 hashCode: " + Integer.toHexString(vehicle4.hashCode()));
        System.out.println("-------------------------------------------------------------------------");

        System.out.println("***HashCode is not a memory location of the object, \n" +
                "       this is information about the object used in the method \"equal\". \n " +
                "       The same object should have the same HashCode.");
    }
}
