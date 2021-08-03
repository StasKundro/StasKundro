package com.company;

import java.util.Scanner;

public class Les2n3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите последнее число");
        int num = scanner.nextInt();
        int y = num / 2;
        int z = 1;
        int x = 1;
        int i = 1;
        while (i < y) {
            ++i;
            z *= 2;
            x += z;
        }
        System.out.println("Сумма 1+2+4+..+" + num + "=" + x);
    }
}
