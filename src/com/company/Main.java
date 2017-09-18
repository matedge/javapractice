package com.company;

public class Main {

    public static void main(String[] args) {
        printOne();
        createHorizontalLine(8);
        createVerticallLine(3);
        createRightTriangle(4);
        createIsociliesTriangle(6);
        createDiamond(6);
        fizzBuzz(17);
    }

//    Print one asterisk to the console.

    public static void printOne() {
        System.out.println("*");
    }

//    Given a number n, print n asterisks on one line.
//    Example when n=8:

    public static void createHorizontalLine(int num){
        for (int i = 0; i <= num; i++){
            System.out.print("*");
        }
    }

//    Given a number n, print n lines, each with one asterisks
//    Example when n=3:

    public static void createVerticallLine(int num){
        for (int i = 0; i <= num; i++){
            System.out.println("*");
        }
    }

//    Given a number n, print n lines, each with one more asterisk than the last (i.e. one on the first line, two on the second,etc.)
//    Example when n=3:

    public static void createRightTriangle( int num){
        for (int i = 0; i <= num; i++){
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

//    Given a number n, print a centered triangle. Example for n=3:

    public static void createIsociliesTriangle( int num){
        for(int i = 1; i <= num; i++)
        {
            for(int k = num; k >= i; k--)
            {
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    

//    Given a number n, print a centered diamond. Example for n=3:

    public static void createDiamond(int num) {
        int middle = (num + 1) / 2;
        int diff = 0;

        for (int i = 1; i < num + 1; i++) {
            for (int j = 1; j < num + 1; j++) {
                if (((middle - diff) <= j && (j <= middle + diff))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            if (i < middle) {
                diff++;
            } else {
                diff--;
            }
        }
    }

    public static void fizzBuzz(int num){

        for (int i = 1; i <= num; i++) {
            boolean found = false;
            if (i % 3 == 0) {
                System.out.print("Fizz");
                found = true;
            }
            if (i % 5 == 0) {
                System.out.print("Buzz");
                found = true;
            }

            if (found) {
                System.out.println();
            } else {
                System.out.println(i);
            }
        }
    }

}

