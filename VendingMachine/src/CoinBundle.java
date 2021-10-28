
public class CoinBundle {
    public int fiveCents;
    public int tenCents;
    public int twentyCents;
    public int fiftyCents;
    public int hundredCents;

    public CoinBundle(int... enteredCoins) {
        this.fiveCents = enteredCoins[0];
        this.tenCents = enteredCoins[1];
        this.twentyCents = enteredCoins[2];
        this.fiftyCents = enteredCoins[3];
        this.hundredCents = enteredCoins[4];
    }

    public int getTotal() {
        int total = 0;
        total = 5 * this.fiveCents + 10 * this.tenCents + 20 * this.twentyCents
                + 50 * this.fiftyCents + 100 * this.hundredCents;
        return total;
    }
}
