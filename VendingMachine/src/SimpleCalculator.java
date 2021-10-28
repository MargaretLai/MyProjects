
public class SimpleCalculator implements Calculator {

    @Override
    public int calculateTotal(CoinBundle enteredCoins) {

        return enteredCoins.getTotal();
    }

    @Override
    public CoinBundle calculateChange(int amountMoneyToReturn) {
        CoinBundle change = new CoinBundle(new int[5]);
        int remainingAmount = amountMoneyToReturn;

        change.hundredCents = remainingAmount / 100;
        remainingAmount %= 100;

        change.fiftyCents = remainingAmount / 50;
        remainingAmount %= 50;

        change.twentyCents = remainingAmount / 20;
        remainingAmount %= 20;

        change.tenCents = remainingAmount / 10;
        remainingAmount %= 10;

        change.fiveCents = remainingAmount / 5;
        remainingAmount %= 5;

        return change;
    }

}
