package lvlTwo.hw4;

import java.util.Locale;

/**
 *Задание 1
 * Дана строка.
 * Удалить из нее все повторяющиеся символы без учета регистра, если они идут друг за другом. Также удалить пробелы.
 * Результат привести к верхнему регистру.
 *
 * Например:
 * "abc Cpddd Dio OsfWw" -> "ABCPDIOSFW"
 */

public class Task1_String {
    public static void main(String[] args) {
        String str = "abc Cpddd Dio OsfWw"; //"abc Cpddd Dio OsfWw"
        System.out.println(deleteСharacters(str));

    }

    public static StringBuilder deleteСharacters(String value){
        String str = value.toUpperCase().replace(" ", "");
        char currentCharacter = str.charAt(0);
        StringBuilder sb = new StringBuilder();
        sb.append(currentCharacter);
        for (int i = 1; i < str.length(); i++){
            if (currentCharacter != (char)str.charAt(i)){
                currentCharacter = (char)str.charAt(i);
                sb.append(currentCharacter);
            }
        }
        return sb;
    }


}
