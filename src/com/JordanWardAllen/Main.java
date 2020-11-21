package com.JordanWardAllen;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        final byte numberOfMonths = 12;
        final byte percent = 100;
        float principal = 0.0F;
        float interestRate = 0.0F;
        int period = 0;


        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Principal: ");
            principal = scanner.nextFloat();
            if (principal < 1000 || principal > 1_000_000) {
                System.out.println("Enter value between $1k and $1M");
                continue;
            }
            break;
        }

        while (true) {
            System.out.print("Enter Annual Interest rate: ");
            interestRate = scanner.nextFloat();
            if (interestRate <= 0 || interestRate >= 30) {
                System.out.println("Enter interest rate between 0% to 30%");
                continue;
            }
            interestRate = interestRate / percent / numberOfMonths;
            break;
        }
        while (true) {
            System.out.print("Enter period: ");
            period = scanner.nextInt();
            if (period < 0 || period > 30) {
                System.out.println("Enter period between 0 to 30");
                continue;
            }
            period *= 12;
            break;
        }

            double result = principal * (interestRate * (Math.pow((1 + interestRate), period))) / (Math.pow(1 + interestRate, period) - 1);

            String resultFormatted = NumberFormat.getCurrencyInstance().format(result);
            System.out.println(resultFormatted);





    }
}
