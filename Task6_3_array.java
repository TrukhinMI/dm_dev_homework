package hw6;

import java.util.Arrays;

/**
 * Задание 3
 * Дан одномерный массив целых чисел.
 * <p>
 * Написать функцию, которая принимает этот массив и разбивает на 3 других: с только отрицательными числами,
 * только положительными и только нули.
 * Если для какого-то из массивов не будет значений, то должен быть создан пустой массив.
 * Возвращает функция эти три массива в виде одного двумерного.
 * <p>
 * Пример:
 * <p>
 * [-4, -18]
 * <p>
 * [-4, 0, 1, 9, 0, -18, 3] -> [0, 0]
 * <p>
 * [1, 9, 3]
 */

public class Task6_3_array {
    public static void main(String[] args) {
        int[] array = {-4, 0, 1, 9, 0, -18, 3};
        int[][] arrays = threeArrays(array);

        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.print(arrays[i][j] + ", ");
            }
            System.out.println();
        }

    }


    public static int[][] threeArrays(int[] array) {
        int countZero = 0;
        int countPositive = 0;
        int countNegative = 0;


        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                countZero++;
            } else if (array[i] > 0) {
                countPositive++;
            } else
                countNegative++;
        }

        int[] arrayZero = new int[countZero];
        int[] arrayPositive = new int[countPositive];
        int[] arrayNegative = new int[countNegative];

        for (int i = 0, zero = 0, positive = 0, negative = 0; i < array.length; i++) {
            if (array[i] == 0) {
                arrayZero[zero++] = array[i];
            } else if (array[i] > 0) {
                arrayPositive[positive++] = array[i];
            } else
                arrayNegative[negative++] = array[i];
        }

        int[][] arrays = new int[3][];
        arrays[0] = new int[countNegative];
        arrays[1] = new int[countZero];
        arrays[2] = new int[countPositive];


        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                if (i == 0) {
                    arrays[i][j] = arrayNegative[j];
                }
                if (i == 1) {
                    arrays[i][j] = arrayZero[j];
                }
                if (i == 2) {
                    arrays[i][j] = arrayPositive[j];
                }
            }
        }

        //  System.out.println(arrays.length);

        return arrays;


    }
}
