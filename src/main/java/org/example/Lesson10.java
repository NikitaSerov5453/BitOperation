package org.example;

import java.util.Scanner;

/**
 * Задание 10
 * Найти и вывести на консоль минимальное из двух чисел
 * M и N, используя только побитовые операции.
 */

public class Lesson10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(lesson10(scanner.nextInt(), scanner.nextInt()));
    }

    public static int lesson10(int m, int n) {
        return m & ((m - n) >> 31) | n & (~(m - n) >> 31);
    }
}
