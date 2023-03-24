package ru.ibs.program10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите размерность матрицы. Количество строк = ");
        int i = input.nextInt();
        System.out.print("Количество столбцов = ");
        int j = input.nextInt();
        double[][] array = new double[i][j];

        System.out.println("Введите значения массива");
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[i].length; j++) {
                System.out.print("array[" + i + "]["+j+"] = ");
                array[i][j] = input.nextDouble();
            }
            System.out.println();
        }

        System.out.println("Вывод значений первой строки, умноженные на 3");
        i=0;
        for (j = 0; j < array[i].length; j++) {
            System.out.print("array[" + i + "]["+j+"] = "+(array[i][j] * 3)+" ");
        }
    }
}
