package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        System.out.println("Input x: ");
        double x = in.nextInt();
        System.out.println("Input y: ");
        double y = in.nextInt();
        double a = (x+1)/(x-1);
        double f = (Math.pow(a,x))+18*x*(Math.pow(y,2));
        System.out.println("Answer: ");
        System.out.println(f);
    }
}