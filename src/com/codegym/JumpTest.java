package com.codegym;

public class JumpTest {

    public static void main(String[] args) {
        for (int i=0; i<3; i++) {
            for (int j=0; j<4; j++) {
                if (j == 2) {
//                    break;
                    continue;
                }
                System.out.println(j);
            }
            System.out.println(i);
        }
    }
}
