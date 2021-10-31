public class Bonus {
    public static void main(String[] args) {
        int balance = 100;
        int refill = 1100;
        int discount = 100;
        int bonus;
        if (refill > 1000) {
            bonus = refill / discount;
        } else {
            bonus = 0;
        }
        int cash = balance + refill + bonus;
        System.out.println("Итоговый счёт: " + cash);
        System.out.println("Бонус: " + bonus);

    }
}
