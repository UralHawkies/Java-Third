public class Main {

    public static void main(String[] args) {

        int baseBalance; //Первоначальный баланс счета
        baseBalance = 100;

        int addedAmount; //Внесенная сумма на счет
        addedAmount = 110;

        int bonus; //Бонус при внесении на счет больше 1000 руб.
        bonus = addedAmount / 100;

        if (addedAmount > 1000) {
            System.out.println(baseBalance + addedAmount + bonus);
        } else {
            System.out.println(baseBalance + addedAmount);
        }

    }
}
