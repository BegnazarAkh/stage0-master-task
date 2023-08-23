package com.epam.loops;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            // Print spaces before the digits
            for (int j = cathetusLength - i; j > 0; j--) {
                System.out.print(" ");
            }

            // Print decreasing digits in ascending order
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // Print increasing digits in descending order
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println(); // Move to the next line
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}

