import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CreditPaymentService pay = new CreditPaymentService();
        System.out.println("Примеры рассчета платежей при ставке 9,99% годовых.");
        System.out.println("Сумма кредите 1 000 000 рублей, период кредитования 1 год.");
        System.out.println(pay.calculate(1000000, 12 * 1));
        System.out.println("Примеры рассчета платежей при ставке 9,99% годовых.");
        System.out.println("Сумма кредите 1 000 000 рублей, период кредитования 2 года.");
        System.out.println(pay.calculate(1000000, 12 * 2));
        System.out.println("Примеры рассчета платежей при ставке 9,99% годовых.");
        System.out.println("Сумма кредите 1 000 000 рублей, период кредитования 3 года.");
        System.out.println(pay.calculate(1000000, 12 * 3));

    }
}
