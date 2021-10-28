
public interface VendingMachine {
    void displayProducts();

    void selectProduct(int product);

    void promptForCoins();

    void enterdCoins(int... coins);

    void displayChangeMessage();
}
