package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input string: ");
        String str1 = in.nextLine();
        System.out.println("Input substring: ");
        String str2 = in.nextLine();
        if (str1.endsWith(str2)) {
            System.out.println(str1.endsWith(str2));
        }
    }
}
