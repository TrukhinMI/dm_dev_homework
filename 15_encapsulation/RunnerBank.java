package lvlTwo.topic15;

public class RunnerBank {
    public static void main(String[] args) {
        Bank bank = new Bank(1,1,1);
        bank.addingMoney(6,3,9);
        boolean result = bank.withdrawMoney(1080);
        System.out.println(result);
    }
}
