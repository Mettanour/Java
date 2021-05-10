package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        System.out.println("Input x: ");
        double x = in.nextInt();
        double a = 1;
        double b = 2;
        double f = 0;
        for ( ; a == x ; a++ , b++){
            double c = x - a++;
            double d = x - b++;
            f = c/d;
        }
        System.out.println(f);
    }
}

