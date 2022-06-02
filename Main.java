package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите положительный х меньше 1");

        double x = in.nextDouble();
        while (Math.abs(x)>1){
            System.out.println("Введите положительный х меньше 1");
            x = in.nextDouble();
        }

        System.out.println("Введите целочисленный n больше 0");
        int n = in.nextInt();
        while (n < 1){
            System.out.println("Введите целочисленный n больше 0");
            n = in.nextInt();
        }

        int b = 1;
        while (b< n+1){
            x += ((chislitel(b) *Math.pow(x, 2*b+1))/(znamenatel(b)*(2*b+1)));
            b++;
        }
        System.out.println("Результат: " + x);
    }

    public static int chislitel(int b){
        int ch = 1;
        while (b != 0){
            ch *= 2*b-1;
            b -=1;
        }
        return ch;
    }

    public static int znamenatel(int b){
        int ch1 = 1;
        while (b != 0){
            ch1 *= 2*b;
            b -=1;
        }
        return ch1;
    }


}