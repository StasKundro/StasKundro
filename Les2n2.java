package com.company;

import java.util.Scanner;

public class Les2n2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Амеба делится каждые 3 часа(введите число часов кратное 3)");
        int time = scanner.nextInt();
        int z = time / 3;
        int i = 0;
        int a = 1;
        while (i < z) {
            ++i;
            a *= 2;
        }

        if (time == 3) {
            System.out.println("Через " + time + " часа будет " + a + " амебы");
        } else if (time == 6) {
            System.out.println("Через " + time + " часов будет " + a + " амебы");
        } else if (time > 7) {
            System.out.println("Через " + time + " часов будет " + a + " амеб");
        }

    }
}
