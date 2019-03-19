package com.Calculate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.println("Введите a и b ");
        int a =k.nextInt();
        int b =k.nextInt();

        Subtraction sub =new Subtraction(a,b);
        Multiplication mul =new Multiplication(a,b);
        Division division=new Division(a,b);
        Addition addition =new Addition(a,b);

    }
}
