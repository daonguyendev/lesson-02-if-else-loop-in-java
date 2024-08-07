package com.codegym;

public class ForEachTest {

    public static void main(String[] args) {
        int[] intNums = {1, 3, 4, 5, 7};
        for (int num: intNums) {
            System.out.println(num);
        }

        String[] names = {"Trung", "Hoàng", "Tân", "Khang"};
        for (String name: names) {
            System.out.println(name);
        }

        char[] names2 = {'T', 'H', 'T', 'K'};
        for (char name1: names2) {
            System.out.println(name1);
        }
    }
}
