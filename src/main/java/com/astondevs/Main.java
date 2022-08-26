package com.astondevs;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in, "cp866");
        taskSelection();
        while (true) {
            System.out.println("> Выбрать еще задание? (Да/Нет):");
            String dialogResult = inputData.next();
            if (Objects.equals(dialogResult, "Да") | Objects.equals(dialogResult, "да")) {
                taskSelection();
            } else if (Objects.equals(dialogResult, "Нет") | Objects.equals(dialogResult, "нет")) {
                System.exit(0);
            } else {
                System.out.println("> Введите \"Да\" или \"Нет\"!");
            }
        }
    }

    public static void taskSelection() {
        Scanner inputData = new Scanner(System.in);
        System.out.println("> Введите номер задания (1-4):");
        try {
            byte taskNum = inputData.nextByte();
            if (taskNum == 1) {
                FirstTask.main();
            } else if (taskNum == 2) {
                SecondTask.main();
            } else if (taskNum == 3) {
                ThirdTask.main();
            } else if (taskNum == 4) {
                FourthTask.main();
            } else {
                System.out.println("> Введен некорректный номер задания!");
            }
        } catch (Exception e) {
            System.out.println("> Некорректные данные!");
        }
    }
}
