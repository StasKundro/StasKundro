package com.company;

import java.util.Scanner;

public class Les2n4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a");
        int num1 = scanner.nextInt();
        System.out.println("Введите число b");
        int num2 = scanner.nextInt();
        int c=0;
        for(int i = 0; i < num2; i++){
            c += num1;
        }
        System.out.println(c);
    }
}
