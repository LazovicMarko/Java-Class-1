package com.javaclass.first.exercises.marko_03_statements;

public class Synchronized_example implements Runnable {
    @Override
     public synchronized void  run() {
        String name = Thread.currentThread().getName();
        System.out.println("Thread " + name + " has accessed the method!");
        int i = 10;
        while (true) {
            try {
                System.out.println("Working with thread : " + name + ", " + i + "%...");
                i = i + 10;
                Thread.sleep(500);
                if (i == 100) {
                    System.out.println("100% - Job is done!");
                    return;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
