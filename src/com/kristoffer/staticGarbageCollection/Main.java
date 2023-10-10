package com.kristoffer.staticGarbageCollection;

public class Main {
    public static void main(String[] args) {

        // Counter counterA = new Counter();
        // Counter counterB = new Counter();

        Test.test();


        for (int i = 0; i < 5; i++) {
            System.out.println("--Counter A--");
            Counter.count();

            System.out.println("--Counter B--");
            // counterB.count();
        }


    }
}
