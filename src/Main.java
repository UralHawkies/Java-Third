public class Main {

    public static void main(String[] args) {

        int baseBalance; //Первоначальный баланс счета
        baseBalance = 100;

        int addedAmount; //Внесенная сумма на счет
        addedAmount = 5000;

        int bonus; //Бонус при внесении на счет больше 1000 руб.
        bonus = addedAmount / 100;

        if (addedAmount < 1000) {
            System.out.println(base_balance + added_amount + " Баланс ");
        }

        if (addedAmount > 1000) {
            System.out.println(baseBalance + addedAmount + " Баланс ");
            System.out.println(bonus + " Бонусы ");
            System.out.println(baseBalance + addedAmount + bonus + " Итого ");
        }

    }
}
