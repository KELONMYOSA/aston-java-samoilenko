package com.astondevs;

import java.util.Objects;
import java.util.Scanner;

public class SecondTask {
    public static void main() {
        Scanner inputData = new Scanner(System.in, "cp866");
        System.out.println("Введите имя:");
        String name = inputData.next();
        if (Objects.equals(name, "Вячеслав") | Objects.equals(name, "вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }
}
