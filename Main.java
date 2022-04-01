package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cat = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int size_massive = cat.nextInt(); // размер массива size
        int[] massive = new int[size_massive]; // массив int размером size
        System.out.println("Введите элемент массива: ");
        for (int i = 0; i < size_massive; i++) {
            massive[i] = cat.nextInt(); // Заполняем массив с клавиатуры
        }
        System.out.print ("Вот массив:");
        System.out.println();
        for (int i = 0; i < size_massive; i++) {
            System.out.print (" " + massive[i]); // Выводим на экран, полученный массив
        }
        int little = massive[0];
        double who;
        for (int k : massive) {
            if (k < little) {
                little = k;
            }
        }
        System.out.println();
        System.out.println("Минимальное значение "+ little);
        System.out.println();
        double sum = 0;
        for (int i : massive) {
            sum += i;
        }
        who = sum/massive.length;
        double summa = who + little;
        System.out.println("Среднее арифметическое значение: "+ who);
        System.out.println();
        System.out.println("Сумма минимального и среднего значения: " + summa);
    }
}