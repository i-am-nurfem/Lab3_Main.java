package Q1;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int i = 1, dollar = 0, cent = 0;

        Checkout[] prices = new Checkout[6];
        while (i <= 5) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the dollar price of item " + i + ": ");
            dollar = dollar + scan.nextInt();
            System.out.println("Enter the cent price of item " + i + ": ");
            cent = cent + scan.nextInt();
            prices[i] = new Checkout(dollar, cent);
            i++;
        }

        System.out.println(prices[prices.length - 1]);

    }
}
