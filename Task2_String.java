package lvlTwo.hw4;

import java.util.Arrays;

/**
 * Задание 2
 * Дана строка с текстом, в котором есть цифры от 0 до 9.
 * Написать 2 метода:
 * - возвращающий массив цифр из переданной строки
 * - возвращающий сумму цифр из переданного целочисленного массива
 * Посчитать сумму всех чисел из строки
 * Например:
 * “Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?” -> 18 (8+1+2+4+3)
 */

public class Task2_String {
    public static void main(String[] args) {
        String str = "Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?";
        char [] numbers = {'0','1','2','3','4','5','6','7','8','9'};
        int[] result = findNumbers(str, numbers);
        System.out.println(sum(result));

    }

    public static int[] findNumbers(String str, char[] numbers){
        int counter = 0;
        int[] arrayNumbers;
        for (int i = 0; i < str.length(); i++){
            for (int j = 0; j < numbers.length; j++){
                if(str.charAt(i) == numbers[j]){
                    counter++;
                }
            }
        }
        arrayNumbers = new int[counter];
//        System.out.println(arrayNumbers.length);

        for (int i = 0, k = 0; i < str.length(); i++){
            for (int j = 0; j < numbers.length; j++){
                if(str.charAt(i) == numbers[j]){
                    arrayNumbers[k] = Character.getNumericValue(str.charAt(i));
                    k++;
                }
            }
        }
        return arrayNumbers;

    }

    public static int sum(int[] array){
        int result = 0;
        for (int i = 0; i < array.length; i++){
            result += array[i];
        }
        return result;
    }


}
