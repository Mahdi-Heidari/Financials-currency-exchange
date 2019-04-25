package currencyexchange;

import java.util.Scanner;

public class CurrencyExchange {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double exchangeRate, amount;
        int selection;

        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa:\t");
        selection = input.nextInt();

        while (selection != 1 && selection != 0) {

            System.out.print("\nEnter 0 ot convert dollars to RMB and 1 vice versa:\t");
            selection = input.nextInt();

        }

        System.out.print("\nEnter the exchange rate from dollars to RMB:\t");
        exchangeRate = input.nextDouble();

        if (selection == 0) {

            System.out.print("\nEnter the dollar amount:\t");
            amount = input.nextDouble();

            System.out.printf("\n$%.2f is %.2f yuan.\n\n", amount, amount * exchangeRate);

        } else {

            System.out.print("\nEnter the RMB amount:\t");
            amount = input.nextDouble();
            System.out.printf("\n%.2f yuan is $%.2f.\n\n", amount, amount / exchangeRate);

        }

    }

}
