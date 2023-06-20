package org.example;

import java.util.Scanner;

/**
 * Задание 5
 * Установить i-й бит числа N равным 0. Вывести результат
 * на консоль в двоичном виде.
 */

public class Lesson5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(lesson5(scanner.nextInt(), scanner.nextInt()));
    }

    public static int lesson5(int n, int i) {
        return n & ~(1 << i);
    }
}
