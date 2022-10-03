package lvlTwo.hw4;

public class Polindrom {
    public static void main(String[] args) {
        String str = "а роза упала на лапу Азора".toLowerCase().replace(" ", "");
        System.out.println(palindrom(str));
    }

    public static boolean palindrom(String value) {
        int counter = 0;
        for (int i = 0, j = value.length() - 1; i < value.length(); i++, j--) {
            if (value.charAt(i) == value.charAt(j)) {
                counter++;
            }
        }

        if (counter == value.length()) {
            return true;
        } else {
            return false;
        }

    }
}
