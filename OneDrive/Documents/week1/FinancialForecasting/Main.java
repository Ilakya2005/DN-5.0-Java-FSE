package FinancialForecasting;

import java.util.Scanner;

public class Main {

    static double futureValue(double amount, double rate, int years) {

        if (years == 0)
            return amount;

        return futureValue(amount * (1 + rate / 100), rate, years - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Present Value: ");
        double amount = sc.nextDouble();

        System.out.print("Enter Growth Rate (%): ");
        double rate = sc.nextDouble();

        System.out.print("Enter Number of Years: ");
        int years = sc.nextInt();

        double result = futureValue(amount, rate, years);

        System.out.println("Future Value = " + result);
    }
}