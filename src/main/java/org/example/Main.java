package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        lesson9(scanner.nextInt(), scanner.nextInt());

    }

    public static int lesson2(int n) {
        return 2 << n;
    }

    public static void lesson3(int n, int i) {
        System.out.println(Integer.toBinaryString(n));
        int mask = 1;
        mask = mask << i;
        n = n | mask;
        System.out.println(n);
        System.out.println(Integer.toBinaryString(n));
    }

    public static void lesson4(int n, int i) {
        System.out.println(Integer.toBinaryString(n));
        int mask = 1;
        mask = mask << i;
        n = n ^ mask;
        System.out.println(n);
        System.out.println(Integer.toBinaryString(n));
    }

    public static void lesson5(int n, int i) {
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(n & ~(1 << i)));
    }

    public static void lesson6(int n, int i) {
        System.out.println(Integer.toBinaryString(n));
        n = n >> i << i;
        System.out.println(Integer.toBinaryString(n));
    }

    public static void lesson7(int n, int i) {
        System.out.println(Integer.toBinaryString(n));
        int mask = 1;
        mask = mask << i;
        n = (n & mask) >> i;

        System.out.println(n);
        System.out.println(Integer.toBinaryString(n));
    }

    public static int lesson8(int n) {
        System.out.println(Integer.toBinaryString(n));
        int mask = 1;
        if (n >= mask << 16) mask <<= 16;
        if (n >= mask << 8) mask <<= 8;
        if (n >= mask << 4) mask <<= 4;
        if (n >= mask << 2) mask <<= 2;
        if (n >= mask << 1) mask <<= 1;
        System.out.println(Integer.toBinaryString(mask));
        System.out.println(Integer.toBinaryString(n ^ mask));
        return n ^ mask;

    }

    public static void lesson9(int m, int n) {
        m = m >> 31;
        n = n >> 31;
        if (n == m) {
            System.out.println("Значения одинаковые");
        } else {
            System.out.println("Значения разные");
        }
    }

    public static void lesson10(int m, int n) {
        
    }
}