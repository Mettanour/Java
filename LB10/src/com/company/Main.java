package com.company;
import java.util.Scanner;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваш IP-адрес");
        String input = in.nextLine();
        boolean result = input.matches("((25[0-5]|2[0-4]\\d[1]?\\d{1,2}\\.}{3}(25[0-5]|2[0-4]\\d[1]?\\d{1,2})))");
        if (result) {
            System.out.println("Ваш IP-адрес правильный");
        }
        else {
            System.out.println("Ваш IP-адрес не правильный");
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("ID.txt"))) {
            bw.write(input);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        String g = in.nextLine();
        if (g.equals("load")) {
            try (BufferedReader br = new BufferedReader(new FileReader("ID.txt"))) {
                String I;
                while ((I = br.readLine()) != null) {
                    System.out.println(I);
                }
            }
            catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}