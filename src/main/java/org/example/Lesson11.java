package org.example;

import java.util.Scanner;

/**
 * Задание 11
 * Посчитать и вывести на консоль количество единичных битов в числе N.
 * Вывести на консоль исходное число в двоичном виде и результат.
 */

public class Lesson11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        lesson11(scanner.nextInt());
    }

    public static void lesson11(int n) {
        System.out.println(Integer.toBinaryString(n));
        int i =  Integer.bitCount(n);
        int mask = 0;
        System.out.println(i);
        System.out.println(Integer.toBinaryString(~(~mask << i)));
    }
}