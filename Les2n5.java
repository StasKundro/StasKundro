package com.company;

public class Les2n5 {
    public static void main(String[] args) {
        int i = 0;
        int a = 1;
        double b = 2.54;
        while(i<20){
            i++;
            System.out.println(a + " | " + String.format("%.2f",b));
            a++;
            b += 2.54;
        }
    }
}
