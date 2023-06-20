package org.example;

import java.util.Scanner;

/**
 * Задание 2
 * Вывести на консоль 2 в степени n. Для вычисления использовать только побитовые операции.
 */

public class Lesson2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(lesson2(scanner.nextInt()));
    }

    public static int lesson2(int n) {
        return 2 << n;
    }
}
