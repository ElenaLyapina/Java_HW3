public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп
        int startingScore = 100;
        int addAmountRub = 2150;
        int bonus;

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
        if (addAmountRub > 1000) {
            bonus = addAmountRub / 100;
        } else {
            bonus = 0;
        }
        System.out.println(bonus + " руб. бонусов");
        System.out.println((startingScore + addAmountRub + bonus) + " руб. на лицевом счете");


    }
}