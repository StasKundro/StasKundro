package com.company;

import java.util.Scanner;

public class Les2n8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер треугольника(1 или 2)");
        int num = scanner.nextInt();
        String[] a = {"   *", "  **", " ***", "****"};
        int x = 4;
        if (num == 1) {
            for (int i = 0; i < 4; i++) {
                System.out.println(a[i]);
            }
        } else if (num == 2) {
            for (int i = 0; i < 4; i++) {
                x--;
                System.out.println(a[x]);
            }
        } else {
            System.out.println("Вы не выбрали треугольник");
        }
    }
}
