package com.company;

import java.util.Scanner;

public class Les2n1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        double x = 10;
        int i = 1;
        double z = 10;
        for (i = 1; i < number; i++) {
            x += (x * 0.1);
            z += x;
        }
        System.out.println("За " + number + " дней он пробежит " + z);


    }
}
