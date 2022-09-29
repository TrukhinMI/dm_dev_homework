package hw6;

/**
 * Задание 1
 * Дан одномерный массив целых чисел.
 * Написать функцию, удаляющую из него все отрицательные элементы (удалить - значит создать новый массив с только
 * положительными элементами).
 * После удаления - умножить каждый элемент массива на его длину.
 * Например: [3, 5, -6, 3, 2, -9, 0, -123] -> [15, 25, 15, 10, 0]
 * <p>
 * Не забывать, что всю логику приложения нужно выносить в отдельные функции. main - только для тестирования написанного функционала.
 */
public class Task6_1_array {
    public static void main(String[] args) {
        int[] array = {3, 5, -6, 3, 2, -9, 0, -123};
        multiplication(deleteValues(array));
    }
    public static void multiplication(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] * array.length + ", ");
        }
    }
    public static int[] deleteValues(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                count++;
            }
        }
        int[] result = new int[count];
        System.out.println("Размер " + result.length);

        for (int i = 0, j = 0; j < array.length; j++) {
            if (array[j] >= 0) {
                result[i++] = array[j];
            }
        }
        return result;
    }
}
