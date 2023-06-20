package org.example;

import java.util.Scanner;

/**
 * Задание 9
 * Определить имеют ли чисел M и N разные знаки. Используя только побитовые и условные операторы.
 */

public class Lesson9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(lesson9(scanner.nextInt(), scanner.nextInt()));
    }

    public static String lesson9(int m, int n) {
        m = m >> 31;
        n = n >> 31;
        if (n == m) {
            return "Знаки одинаковые";
        } else {
            return "Знаки разные";
        }
    }
}
