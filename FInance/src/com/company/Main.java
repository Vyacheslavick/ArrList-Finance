package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FinanceSystem list = new FinanceSystem(Generator.generate());
        System.out.println("");
        System.out.println("What type of operation you want to do? We can offer you:");
        System.out.println("1.Exchange UAH to currency");
        System.out.println("2.Exchange another currency to UAH");
        System.out.println("3.Send money");
        System.out.println("4.Take a loan");
        System.out.println("5.Put on deposit");
        byte operation = Byte.parseByte(scanner.nextLine());
        if (operation == 1){
            System.out.println("Enter your money to exchange:");
            float money = Float.parseFloat(scanner.nextLine());
            System.out.println("Enter currency(USD, RUB, EUR):");
            String currency = scanner.nextLine();
            list.exOrganizationsToCurrency(money, currency);
        }
        else if (operation == 2){
            System.out.println("Enter your money to exchange:");
            float money = Float.parseFloat(scanner.nextLine());
            System.out.println("Enter your currency(USD, RUB, EUR):");
            String currency = scanner.nextLine();
            list.exOrganizationsToUAH(money, currency);
        }
        else if (operation == 3){
            System.out.println("Enter your money to send:");
            float money = Float.parseFloat(scanner.nextLine());
            System.out.println("Enter your currency(USD, RUB, EUR, UAH):");
            String currency = scanner.nextLine();
            list.sendCash(money,currency);
        }
        else if (operation == 4){
            System.out.println("How much money you want to lend?");
            float credit = Float.parseFloat(scanner.nextLine());
            list.takeLoan(credit);
        }
        else if (operation == 5){
            System.out.println("How much money you want to put on deposit ?");
            float credit = Float.parseFloat(scanner.nextLine());
            list.putDeposit(credit);
        }
    }
}
