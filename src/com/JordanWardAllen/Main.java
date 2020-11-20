package com.JordanWardAllen;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        final byte numberOfMonths = 12;
        final byte percent = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        float principal =  scanner.nextFloat();


        System.out.print("Enter Annual Interest rate: ");
        float interestRate = scanner.nextFloat() / percent / numberOfMonths;

        System.out.print("Enter period: ");
        int period = scanner.nextInt() * 12;

        double result = principal * (interestRate * (Math.pow((1 + interestRate), period)))/(Math.pow(1 + interestRate, period) - 1);

        String resultFormatted =  NumberFormat.getCurrencyInstance().format(result);

        System.out.println(resultFormatted);

    }
}
