
public class TextBasedVendingMachine implements VendingMachine {

    private int selectedProduct;
    private CoinBundle change;

    @Override
    public void displayProducts() {
        System.out.println(" ******************************************* ");
        System.out.println("          WELCOME TO MY VENDING MACHINE      ");
        System.out.println(" ******************************************* ");

        System.out.println("              Product Available              ");
        System.out.println("                                             ");
        for (Product product : Product.values()) {
            System.out.println("      " + product.getId() + " " + product.name()
                    + " - Price: " + product.getPrice());
        }

        System.out.println("                                             ");
        System.out.println(" Please select your product:  ");
    }

    @Override
    public void selectProduct(int product) {
        this.selectedProduct = product;
    }

    @Override
    public void promptForCoins() {
        System.out.println("Please enter coins as follows: ");
        System.out.println(
                " num of 5 cent, num of 10 cents, num of 20 cents, num of 50 cents, num of 100 cents ");
        System.out.println("                                             ");
        System.out.println(
                " Example: If you would like to enter two 10 cents coins: 0, 2, 0, 0, 0");
        System.out.println("Please enter coins: ");
    }

    @Override
    public void enterdCoins(int... coins) {
        Calculator calculator = new SimpleCalculator();
        Product product = Product.valueOf(this.selectedProduct);
        int total = calculator.calculateTotal(new CoinBundle(coins));

        int changeAmount = total - product.getPrice();
        this.change = calculator.calculateChange(changeAmount);
    }

    @Override
    public void displayChangeMessage() {
        System.out.println("                                             ");
        System.out.println("Your chane is : " + this.change.getTotal()
                + " Change split as follows: ");
        System.out.println("100 cents coins: " + this.change.hundredCents);
        System.out.println("50 cents coins: " + this.change.fiftyCents);
        System.out.println("20 cents coins: " + this.change.twentyCents);
        System.out.println("10 cents coins: " + this.change.tenCents);
        System.out.println("5 cents coins: " + this.change.fiveCents);

    }

}
