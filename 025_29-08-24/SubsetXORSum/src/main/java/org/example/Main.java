package org.example;

import org.example.model.Solution;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().subsetXORSum(new int[]{1, 3})); // 6

        System.out.println(new Solution().subsetXORSum(new int[]{5, 1, 6})); // 28
    }
}