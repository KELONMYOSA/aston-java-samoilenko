package com.astondevs;

import java.util.Scanner;

public class FirstTask {
    public static void main() {
        Scanner inputData = new Scanner(System.in);
        System.out.println("Введите число:");
        try {
            float num = inputData.nextFloat();
            if (num > 7) {
                System.out.println("Привет");
            }
        } catch (Exception e) {
            System.out.println("Некорректные данные!");
        }
    }
}
