package com.codegym;

import java.util.Scanner;

public class WhileTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choose = "";
        int i = 0;

        while(!choose.equals("q")) {
            System.out.print("Enter any keyword: ");
            choose = scanner.nextLine();

            System.out.println("Làm đại gì đi! " + i);
            i++;

            if (i == 5) {
                System.out.println("Bạn đã nhập quá số lần quy định!");
                break;
            }
        }
        System.out.println("See you again!");
    }
}
