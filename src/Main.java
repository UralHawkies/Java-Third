public class Main {

    public static void main(String[] args) {

        int base_balance; //Первоначальный баланс счета
        base_balance = 100;

        int added_amount; //Внесенная сумма на счет
        added_amount = 110;

        int bonus; //Бонус при внесении на счет больше 1000 руб.
        bonus = added_amount / 100;

        if (added_amount > 1000) {
            System.out.println(base_balance + added_amount + bonus);
        } else {
            System.out.println(base_balance + added_amount);
        }

    }
}
