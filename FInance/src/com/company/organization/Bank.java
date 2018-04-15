package com.company.organization;

import com.company.*;
import com.company.organization.interFace.Creditor;
import com.company.organization.interFace.Exchange;
import com.company.organization.interFace.Investor;
import com.company.organization.interFace.Sender;

public class Bank extends Organization implements Exchange, Investor, Sender, Creditor {
    float courseUSD;
    float courseRUB;
    float courseEUR;
    int yearLicence;
    int exlimit;

    public Bank(String name, String adress, float courseUSD, float courseRUB, float courseEUR, int yearLicence, int exlimit) {
        super(name, adress);
        this.courseUSD = courseUSD;
        this.courseRUB = courseRUB;
        this.courseEUR = courseEUR;
        this.yearLicence = yearLicence;
        this.exlimit = exlimit;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Dollar Course: " + courseUSD);
        System.out.println("Euro Course: " + courseEUR);
        System.out.println("Ruble Course: " + courseRUB);
        System.out.println("Licence year: " + yearLicence);
    }

    @Override
    public void exchangeToAnotherValue(float money, String value) {
        if (money < exlimit) {
            if (value.equalsIgnoreCase("USD")) {
                System.out.println(String.format(" %s exchanged your money to %.2f USD", name, money / courseUSD - 15 / courseUSD));
            } else if (value.equalsIgnoreCase("EUR")) {
                System.out.println(String.format(" %s exchanged your money to %.2f RUB", name, money / courseRUB - 15 / courseRUB));
            } else if (value.equalsIgnoreCase("RUB")) {
                System.out.println(String.format(" %s exchanged your money to %.2f RUB", name, money / courseRUB - 15 / courseRUB));
            } else {
                System.out.println("Seek currency not found");
            }
        } else {
            System.out.println(String.format("Sorry, but %s can't exchange your money", name));
        }
    }

    @Override
    public void exchangeToUAH(float money, String value) {
        float haveHRN = 0;
        if (value.equalsIgnoreCase("USD")) {
            haveHRN = money*courseUSD;
        } else if (value.equalsIgnoreCase("EUR")) {
            haveHRN = money*courseEUR;
        } else if (value.equalsIgnoreCase("RUB")) {
            haveHRN = money*courseRUB;
        } else {
            System.out.println("Your currency not found");
        }
        if (haveHRN < exlimit) {
            System.out.println(String.format(" %s exchanged your money to %.2f UAH", name, haveHRN - 15));
        } else {
            System.out.println(String.format("%s cant exchange your money (Too much, you can proud of yourself, because you are rich )", name));
        }
    }

    @Override
    public void deposite(float investition) {
        System.out.println(String.format(" You give %.2f to %s ", investition, name));
        System.out.println(String.format(" In a year you will receive %.2f", investition * 1.1));

    }

    @Override
    public void send(float send, String currency) {
        double commission = send * 0.1 - 5;
        boolean canSend = true;
        if (currency.equalsIgnoreCase("UAH")) {
            commission = send * 0.1 - 5;
        } else if (currency.equalsIgnoreCase("EUR")) {
            commission = send * 0.1 - 5 / courseEUR;
        } else if (currency.equalsIgnoreCase("USD")) {
            commission = send * 0.1 - 5 / courseUSD;
        } else if (currency.equalsIgnoreCase("RUB")) {
            commission = send * 0.1 - 5 / courseRUB;
        } else {
            System.out.println("We can't send this type of value");
            canSend = false;
        }
        if (canSend) {
            System.out.println(String.format("You send %.2f ", send - commission));
            System.out.println(String.format("Your commission: %.2f ", commission));
        }
    }

    @Override
    public void credit(float money) {
        if (money <= 200000) {
            double returnToBank = money * 1.25;
            System.out.println(String.format("You get %.2f from %s", money, name));
            System.out.println(String.format("You must return %.2f hrn in a year", returnToBank));
        } else {
            System.out.println("Bank haven't enough money!");
        }
    }
}