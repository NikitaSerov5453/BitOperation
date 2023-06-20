package org.example;

import java.util.Scanner;

/**
 * Задание 1
 * Обнулить бит в нулевом разряде числа N. Остальные
 * биты не должны изменить свое значение. Вывести на консоль в двоичном виде.
 */

public class Lesson1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(lesson1(scanner.nextInt()));
    }

    public static int lesson1(int n) {
        return n >> 1 << 1;

    }
}
