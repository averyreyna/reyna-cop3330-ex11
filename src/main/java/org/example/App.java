/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Avery Reyna
 */

package org.example;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // inputs 1 and 2 ask the user for the number of euros and exchange rate
        Scanner input = new Scanner(System.in);
        System.out.print("How many euros are you exchanging? ");
        String inputEuros = input.nextLine();

        Scanner input2 = new Scanner(System.in);
        System.out.print("What is the exchange rate? ");
        String inputExchangeRate = input2.nextLine();

        // these are the double versions of the inputted strings to make sure the output is consistent with the ones shown
        double convertedEuros = Double.parseDouble(inputEuros);
        double convertedRate = Double.parseDouble(inputExchangeRate);

        // math for getting U.S. dollars conversion
        double totalDollars = convertedEuros * convertedRate;

        // formatted string for output on next line
        String currencyConversion = String.format("%s euros at an exchange rate of %s is\n%.2f U.S. dollars.", inputEuros, inputExchangeRate, totalDollars);

        System.out.println(currencyConversion);
    }
}