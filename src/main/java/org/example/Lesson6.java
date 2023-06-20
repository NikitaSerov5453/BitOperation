package org.example;

import java.util.Scanner;

/**
 * Задание 6
 * Обнулить все кроме последних i битов числа N. Вывести
 * результат на консоль в двоичном виде.
 */

public class Lesson6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(lesson6(scanner.nextInt(), scanner.nextInt()));
    }

    public static int lesson6(int n, int i) {
        return n >> i << i;
    }
}
