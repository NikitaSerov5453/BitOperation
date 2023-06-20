package org.example;

import java.util.Scanner;

/**
 * Задание 8
 * Обнулить крайний левый (старший разряд) единичный
 * бит числа N. Вывести результат на консоль в двоичном виде.
 */

public class Lesson8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(lesson8(scanner.nextInt()));
    }

    public static int lesson8(int n) {
        int mask = 1;
        if (n >= mask << 16) mask <<= 16;
        if (n >= mask << 8) mask <<= 8;
        if (n >= mask << 4) mask <<= 4;
        if (n >= mask << 2) mask <<= 2;
        if (n >= mask << 1) mask <<= 1;
        return n ^ mask;
    }
}
