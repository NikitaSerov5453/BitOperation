package org.example;

import java.util.Scanner;

/**
 * Проверить, есть ли в двоичной записи числа n хотя бы
 * один 0. Используя только побитовые и условные операторы.
 * Вывести на консоль исходное число в двоичном виде и результат.
 */

public class Lesson12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        lesson12(scanner.nextInt());
    }

    public static void lesson12(int n) {
        int i = ~n;
        int lengthN = Integer.toBinaryString(n).length();
        int mask = 32 - lengthN;
        int k = i << mask;
        int countZero = Integer.bitCount(k);
        System.out.println(Integer.toBinaryString(n));
        System.out.println("Нулей " + countZero);
    }
}
