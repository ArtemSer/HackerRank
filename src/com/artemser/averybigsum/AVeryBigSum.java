package com.artemser.averybigsum;

public class AVeryBigSum {
    public static void main(String[] args) {
        final int n = 3;
        long[] ar = {1000000001,1000000002, 1000000003};
        long sum = 0;
        for (long anAr : ar) sum += anAr;
        System.out.println(sum);
    }
}
