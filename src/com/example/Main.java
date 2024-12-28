package com.example;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 1, 2, 4};
        int max = ArrayUtils.findMax(numbers);
        System.out.println("Максимальное значение: " + max);
    }
}