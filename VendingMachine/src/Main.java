import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        VendingMachine vendingMachine = new TextBasedVendingMachine();

        vendingMachine.displayProducts();

        String selectedProduct = scanner.nextLine();
        int selectedProductNumber = Integer.parseInt(selectedProduct);

        vendingMachine.selectProduct(selectedProductNumber);

        vendingMachine.promptForCoins();

        String coinsReceived = scanner.nextLine();

        int[] coinsArr = Coin.parseCoins(coinsReceived);

        vendingMachine.enterdCoins(coinsArr);

        vendingMachine.displayChangeMessage();

        scanner.close();
    }
}
