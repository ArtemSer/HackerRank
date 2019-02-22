package com.artemser.staircase;

import java.util.Scanner;

public class Staircase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str = "#";
        for (int i = 0; i < n; i++, str += '#')
            System.out.printf("%" + n + "s%n", str);
    }
}
