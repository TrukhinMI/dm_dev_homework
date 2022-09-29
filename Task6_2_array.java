package hw6;

import java.util.Arrays;

/**
 * ﻿Задание 2
 * Дан одномерный массив символов.
 * Преобразовать его в одномерный массив чисел, где число - это код символа (любой символ - это число в памяти компьютера).
 * Например: [‘a’, ‘6’, ‘y’, ‘P’, ‘T’, ‘q’, ‘9’, ‘+’] -> [97, 54, 121, 80, 84, 113, 57, 43]
 *
 * Далее определить среднее арифметическое всех элементов целочисленного массива и вывести на консоль только те элементы,
 * которые больше этого среднего арифметического.
 */
public class Task6_2_array {
    public static void main(String[] args) {
        char[] symbols = {'a', '6', 'y', 'P', 'T', 'q', '9', '+'};
        findMiddle(convert(symbols));
    }

    public static void findMiddle(int[] values){
        int sum = 0;
        for (int i = 0; i < values.length; i++){
            sum+=values[i];
        }
        int middle = sum / values.length;

        for (int i = 0; i < values.length; i++){
            if (values[i] > middle){
                System.out.print(values[i] + ", ");
            }
        }

    }


    public static int[] convert(char[] symbols){
        int[] kodSymbols = new int[symbols.length];
        for (int i = 0; i < symbols.length; i++){
            kodSymbols[i] = (int)(symbols[i]);
        }
        return kodSymbols;

//        System.out.println(Arrays.toString(kodSymbols));
    }


}
