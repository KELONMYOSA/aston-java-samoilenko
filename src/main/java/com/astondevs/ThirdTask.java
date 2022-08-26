package com.astondevs;

import java.util.Scanner;

public class ThirdTask {
    public static void main() {
        Scanner inputData = new Scanner(System.in);

        System.out.println("Введите длину числового массива:");
        int size;
        try {
            size = inputData.nextInt();
            if (size < 1) {
                System.out.println("Длина должна быть больше 1!");
            }
        } catch (Exception e) {
            System.out.println("Некорректные данные!");
            return;
        }
        int[] array = new int[size];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            try {
                array[i] = inputData.nextInt();
            } catch (Exception e) {
                System.out.println("Некорректные данные!");
                return;
            }
        }

        System.out.println("Элементы кратные 3:");
        for (int i = 0; i < size; i++) {
            if (array[i] % 3 == 0){
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }
}
