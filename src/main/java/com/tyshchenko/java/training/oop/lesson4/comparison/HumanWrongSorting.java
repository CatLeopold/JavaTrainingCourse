package com.tyshchenko.java.training.oop.lesson4.comparison;

import java.util.Arrays;

/**
 * @author Alexander Tyshchenko.
 */
public class HumanWrongSorting {
    public static void main(String[] args) {
        Human[] humans = {
                new Human(40),
                new Human(10),
                new Human(2)
        };

        Arrays.sort(humans); // ClassCastException

        for (Human human : humans) {
            System.out.println(human);
        }
    }
}
