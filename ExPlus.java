package hw6;

import java.io.*;

public class ExPlus {
    public static void main(String[] args) {
        int[][] arrays = {
                {3, 3, 2, 3},
                {2, 1, 2},
                {5, 1, 2, 3, 4, 5}
        };

        int[][] arrays2 = {
                {3, 1, 2, 3},
                {2, 1, 2},
                {5, 1, 2, 3, 4, 5}
        };
//        findMaxMin(arrays);
//        findMaxMin(arrays2);

        convertInt(readFile());
    }

    public static void convertInt(String[] arrayStr) {
        String[][] arraysString = new String[100][];
        int[][] arraysInt = new int[100][];

        for (int i = 0; i < arrayStr.length; i++) {
            arraysString[i] = new String[arrayStr[i].split(" ").length];
            arraysInt[i] = new int[arrayStr[i].split(" ").length - 1];
            for (int j = 0; j < arrayStr[i].length(); j++) {
                arraysString[i] = arrayStr[i].split(" ");
            }
        }

        for (int i = 0; i < arraysString.length; i++) {
            for (int js = 1, ji = 0; js < arraysString[i].length; js++, ji++) {
                arraysInt[i][ji] = Integer.parseInt(arraysString[i][js]);
            }
        }
        findMaxMin(arraysInt);
    }

    public static String[] readFile() {
        String[] strArrays = new String[100];
        try {
            File file = new File("C:/Users/maxli/IdeaProjects/learnJava/src/hw6/task1_input.txt");
            FileReader fr = new FileReader(file); //объект для объекта File
            BufferedReader bf = new BufferedReader(fr); //для построчного считывания
            String line = bf.readLine(); //считываем первую строку
            for (int i = 0; line != null; i++) {
                strArrays[i] = line;
                line = bf.readLine();

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return strArrays;
    }

    public static void findMaxMin(int values[][]) {
        int max = values[0][0];
        int min = values[0][0];
        int[] multiplicationMaxMin = new int[values.length];

        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                if (j == 0) {
                    max = values[i][0];
                    min = values[i][0];
                }
                if (j != 0 && max < values[i][j]) {
                    max = values[i][j];
                }
                if (j != 0 && min > values[i][j])
                    min = values[i][j];

                if (j == values[i].length - 1) {
                    multiplicationMaxMin[i] = max * min;

                    System.out.println();
                }
            }
        }
        for (int i = 0; i < multiplicationMaxMin.length; i++) {
            System.out.println("В массиве " + (i + 1) + " произведение равно " + multiplicationMaxMin[i]);
        }
        int maxValue = multiplicationMaxMin[0];
        int maxIndexValue = 0;
        for (int i = 1; i < multiplicationMaxMin.length; i++) {
            if (maxValue < multiplicationMaxMin[i]) {
                maxValue = multiplicationMaxMin[i];
                maxIndexValue = i;
            }
        }
        System.out.println("Максимальное произведение чисел в строке " + (maxIndexValue + 1));

    }
}
