package com.company;

public class Les2n7 {
    public static void main(String[] args) {
        int i = 0;
        int x = 0;
        while (i < 100) {
            i++;
            if ((i % 2) != 0) {
                x += i;
            }
        }
        System.out.println("Сумма нечетных чисел = " + x);
    }
}
