package org.example;

import java.util.Scanner;

/**
 * Задание 3
 * Установить i-й бит числа N равным 1. Вывести результат
 * на консоль в двоичном виде.
 */

public class Lesson3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(lesson3(scanner.nextInt(), scanner.nextInt()));
    }

    public static int lesson3(int n, int i) {
        int mask = 1;
        mask = mask << i;
        return n | mask;
    }
}
