package com.company;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("The Num1: ");
        int Num1 = in.nextInt();
        System.out.print("The Num2: ");
        int Num2 = in.nextInt();
        int temp = Num1;
        Num1 = Num2;
        Num2 = temp;
        System.out.println(Num1 + " " + Num2);
    }
}
