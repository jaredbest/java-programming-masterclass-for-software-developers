package com.jaredbest;

public class Main {

    public static void main(String[] args) {

        int myVariable = 50;

        if (myVariable == 50) {
            System.out.println("Printed");
        }

        myVariable++;
        myVariable--;
        System.out.println("This is a test");

        System.out.println("This is" +
                " another" +
                " still more.");

        int anotherVariable = 50;myVariable--; // Valid but not recommended
        System.out.println("This is another one");
    }
}
