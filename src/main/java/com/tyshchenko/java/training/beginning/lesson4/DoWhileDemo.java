package com.tyshchenko.java.training.beginning.lesson4;

/**
 * @author Alexander Tyshchenko.
 */
public class DoWhileDemo {
    public static void main(String[] args) {
        int count = 1;
        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count < 11);
    }
}