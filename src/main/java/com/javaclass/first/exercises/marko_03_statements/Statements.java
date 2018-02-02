package com.javaclass.first.exercises.marko_03_statements;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Statements {
    private static Scanner s;
    private static Random r;

    public static void main(String[] args) {
        //Statements
        //if statement
        statementIf1();
        statementIf2();

        //Switch statement
         statementSwitch1();
         statementSwitch2();

        //While statement
        statementWhile1();
        statementWhile2();

        //statementFor();
        statementFor();

        //statementSynchronized
        Synchronized_example synchronized_example = new Synchronized_example();
        Thread thread1 = new Thread(synchronized_example);
        Thread thread2 = new Thread(synchronized_example);
        thread1.start();
        thread2.start();
    }

    private static void statementIf1() {
        s = new Scanner(System.in);
        System.out.println("2 + 2 = ");
        int answer = s.nextInt();
        if (answer == 4) {
            System.out.println("Correct answer! ");
        } else {
            System.out.println("Wrong answer! ");
        }
    }

    private static void statementIf2() {
        s = new Scanner(System.in);
        System.out.println("Which is the best programming language:");
        String answer = s.nextLine();
        if (answer.equals("Java")) {
            System.out.println("Correct answer!");
        } else if (answer.equals("C++")) {
            System.out.println("Good for you!");
        } else if (answer.equals("Pascal")) {
            System.out.println("-10 points");
        } else {
            System.out.println("Wrong answer!");
        }
    }

    private static void statementSwitch1() {
        s = new Scanner(System.in);
        System.out.println("coffee maker");
        System.out.println("---------------");
        System.out.println("Select an option from the menu:");
        System.out.println("1. Espreso");
        System.out.println("2. Kapucino");
        System.out.println("3. Hot chocolate");
        int answer = s.nextInt();
        switch (answer) {
            case (1): {
                System.out.println("Making Espreso...");
                break;
            }
            case (2): {
                System.out.println("Making Kapucino...");
                break;
            }
            case (3): {
                System.out.println("Making Hot chocolate...");
                break;
            }
            default: {
                System.out.println("Wrong option!");
            }
        }
    }

    private static void statementSwitch2() {
        s = new Scanner(System.in);
        System.out.println("Do you want to continue?");
        System.out.println("Yes or No:");
        String str = s.nextLine();
        str.toLowerCase();
        char answer = str.charAt(0);
        switch (answer) {
            case 'y': {
                System.out.println("Great!");
                break;
            }
            case 'n': {
                System.out.println("Bye!");
                System.exit(0);
            }
            default: {
                System.out.println("wrong option!");
            }
        }
    }

    private static void statementWhile1() {
        s = new Scanner(System.in);
        System.out.println("Calculate the factor of the number: ");
        int num = s.nextInt();
        int result = 1;
        while (num != 1) {
            result = result * num;
            num--;
        }
        System.out.println("Result: " + result);
    }

    private static void statementWhile2() {
        s = new Scanner(System.in);
        r = new Random();
        boolean b = false;
        System.out.println("You have to give the correct answer to continue: ");
        do {
            int num1 = r.nextInt(10);
            int num2 = r.nextInt(10);
            System.out.println(num1 + " * " + num2 + " =");
            int answer = s.nextInt();
            if (answer == (num1 * num2)) {
                b = true;
            } else {
                System.out.println("Wrong!");
                System.out.println("Again!");
            }
        } while (!b);
        System.out.println("Well done!");
    }

    private static void statementFor() {
        System.out.println("This algorithm will determine the first 100 prime numbers!");
        boolean isPrime = true;
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int n = 1; n < 100; n++) {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrime=false;
                }
            }
            if(!isPrime){
                isPrime=true;
                continue;
            }
            list.add((Integer) n);
        }

        System.out.println("Prime numbers:");

        for (Integer number : list) {
            System.out.println("" + number);
        }
    }

}

