package com.artemser.diagonaldifference;


public class DiagonalDifference {
    public static void main(String[] args) {
        int[][] a = {
                {11, 2, 4},
                {4, 5, 6},
                {10, 8, -12}
        };
        int sum1 = 0,
                sum2 = 0;
        for(int i = 0; i < a.length; i++){
            sum1 += a[i][i];
            sum2 += a[(a.length - 1) - i][i];
        }
        System.out.println(Math.abs(sum1 - sum2));
    }
}
