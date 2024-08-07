package com.codegym;

import java.util.Scanner;

public class Practice01CheckPriceNumber {

    private static boolean isPrimeNumber(int n) {
        int count = 0;
        for(int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }
        return (count == 2) ? true :false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        if (isPrimeNumber(n)) System.out.printf("%d is prime number", n);
        else System.out.printf("%d is not prime number", n);
    }
}
