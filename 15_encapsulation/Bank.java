package lvlTwo.topic15;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Bank {
    private int numberBanknotesTwenty = 0;
    private int numberBanknotesFifty = 0;
    private int numberBanknotesOneHundred = 0;

    public Bank(int numberBanknotesTwenty, int numberBanknotesFifty, int numberBanknotesOneHundred) {
        this.numberBanknotesTwenty = numberBanknotesTwenty;
        this.numberBanknotesFifty = numberBanknotesFifty;
        this.numberBanknotesOneHundred = numberBanknotesOneHundred;
        addingMoney(numberBanknotesTwenty, numberBanknotesFifty, numberBanknotesOneHundred);
    }

    public static int TWENTY = 20;
    public static int FIFTY = 50;
    public static int ONE_HUNDRED = 100;


    private int allMoney = 0;

    public void addingMoney(int numberBanknotesTwenty, int numberBanknotesFifty, int numberBanknotesOneHundred) {
        this.numberBanknotesTwenty += numberBanknotesTwenty;
        this.numberBanknotesFifty += numberBanknotesFifty;
        this.numberBanknotesOneHundred += numberBanknotesOneHundred;

        allMoney += numberBanknotesTwenty * TWENTY + numberBanknotesFifty * FIFTY + numberBanknotesOneHundred * ONE_HUNDRED;
    }

    public void print() {
//        System.out.println("Купюр номиналом 20: "  + getNumberBanknotesTwenty());
//        System.out.println("Купюр номиналом 50: "  + getNumberBanknotesFifty());
//        System.out.println("Купюр номиналом 100: "  + getNumberBanknotesOneHundred());
//        System.out.println(allMoney);
    }

    public void twoWithdrawMoney(int sum) {

    }

    public boolean withdrawMoney(int sum) {
        int currentSum = sum;
        int currentOneHundred = 0;
        int currentFifty = 0;
        int currentTwenty = 0;
        while (currentSum != 0) {
            if (currentSum > allMoney) {
                System.out.println("Укажите сумму меньше");
            }

            if (currentSum > ONE_HUNDRED && (currentSum / ONE_HUNDRED) <= (numberBanknotesOneHundred)) {
                currentOneHundred = currentSum / ONE_HUNDRED;
                currentSum -= currentOneHundred * ONE_HUNDRED;
            } else if (currentSum > ONE_HUNDRED && (currentSum / ONE_HUNDRED) > (numberBanknotesOneHundred)) {
                currentOneHundred = numberBanknotesOneHundred;
                currentSum -= numberBanknotesOneHundred * ONE_HUNDRED;
            }
            if (currentSum >= FIFTY && (currentSum / FIFTY) <= numberBanknotesFifty && currentSum % FIFTY != 10 && currentSum % FIFTY != 30) {
                currentFifty = currentSum / FIFTY;
                currentSum -= currentFifty * FIFTY;
            } else if (currentSum % FIFTY == 10) {
                currentTwenty += 1;
                currentSum -= TWENTY;
                currentFifty = currentSum / FIFTY;
                currentSum -= currentFifty * FIFTY;
            } else if (currentSum % FIFTY == 30) {
                currentTwenty += 3;
                currentSum -= TWENTY * 3;
                currentFifty = currentSum / FIFTY;
                currentSum -= currentFifty * FIFTY;
            }

            if (currentSum % 20 == 0 && numberBanknotesTwenty >= (currentSum / TWENTY)) {
                int banknotesTwenty = currentSum / TWENTY;
                currentTwenty += currentSum / TWENTY;
                currentSum -= banknotesTwenty * TWENTY;
            }

            System.out.println("Снято: ");
            System.out.println(String.format("%s купир номиналом 100 ", currentOneHundred));
            System.out.println(String.format("%s купир номиналом 50 ", currentFifty));
            System.out.println(String.format("%s купир номиналом 20 ", currentTwenty));
//            System.out.println(currentSum);
        }

        if (currentSum == 0) {

            return true;
        } else
            return false;
    }


    public int getNumberBanknotesTwenty() {
        return numberBanknotesTwenty;
    }

    public void setNumberBanknotesTwenty(int numberBanknotesTwenty) {
        this.numberBanknotesTwenty = numberBanknotesTwenty;
    }

    public int getNumberBanknotesFifty() {
        return numberBanknotesFifty;
    }

    public void setNumberBanknotesFifty(int numberBanknotesFifty) {
        this.numberBanknotesFifty = numberBanknotesFifty;
    }

    public int getNumberBanknotesOneHundred() {
        return numberBanknotesOneHundred;
    }

    public void setNumberBanknotesOneHundred(int numberBanknotesOneHundred) {
        this.numberBanknotesOneHundred = numberBanknotesOneHundred;
    }

    public int getAllMoney() {
        return allMoney;
    }

    public void setAllMoney(int allMoney) {
        this.allMoney = allMoney;
    }
}
