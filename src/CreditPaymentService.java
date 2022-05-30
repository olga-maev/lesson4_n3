public class CreditPaymentService {
    public int calculate(int creditAmount, int repaymentTime) {
        double rate = 0.008325;
        double payOne = creditAmount * ((rate * (Math.pow((1 + rate), (double) repaymentTime)))) / (Math.pow((1 + rate), (double) repaymentTime) - 1);
        return (int) payOne;
    }
}
