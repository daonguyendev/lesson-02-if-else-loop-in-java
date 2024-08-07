package com.codegym;

import java.util.Scanner;

public class Practice02CalcInterestMoney {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter money: ");
        double money = scanner.nextDouble();

        System.out.println("Enter interestRatePerMonth: ");
        double interestRatePerMonth = scanner.nextDouble();

        System.out.println("Enter month: ");
        int month = scanner.nextInt();

        double totalMoney = 0, interest = 0;
        interest = money * (interestRatePerMonth / 100) / 12 * month;
        totalMoney += interest;

        System.out.println("Total Money is: " + totalMoney);
    }
}
