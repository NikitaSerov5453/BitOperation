package org.example;

import java.util.Scanner;

/**
 * Задание 4
 * Инвертировать i-й бит числа N. Вывести результат на
 * консоль в двоичном виде.
 */

public class Lesson4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(lesson4(scanner.nextInt(), scanner.nextInt()));
    }

    public static int lesson4(int n, int i) {
        int mask = 1;
        mask = mask << i;
        return n ^ mask;
    }
}
