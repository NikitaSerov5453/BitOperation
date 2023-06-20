package org.example;

import java.util.Scanner;

/**
 * Задание 7
 * Определить значение i-го бита числа N. Вывести результат на консоль в двоичном виде.
 */

public class Lesson7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(lesson7(scanner.nextInt(), scanner.nextInt()));
    }

    public static int lesson7(int n, int i) {
        int mask = 1;
        mask = mask << i;
        return (n & mask) >> i;
    }
}
