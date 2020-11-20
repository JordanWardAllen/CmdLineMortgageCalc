package com.JordanWardAllen;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        float principal =  Float.parseFloat(scanner.nextLine().trim());


        System.out.print("Enter Annual Interest rate: ");
        float interestRate = Float.parseFloat(scanner.nextLine().trim()) / 100 / 12;

        System.out.print("Enter period: ");
        int period = Integer.parseInt(scanner.nextLine().trim()) * 12;


        double result = principal * (interestRate * (Math.pow((1 + interestRate), period)))/(Math.pow(1 + interestRate, period) - 1);
        NumberFormat resultFormatted =  NumberFormat.getCurrencyInstance();

        System.out.println(resultFormatted.format(result));

    }
}
