package com.company.organization;

import com.company.organization.interFace.Exchange;
import com.company.Organization;

public class Exchanger  extends Organization implements Exchange {
    float courseUSD;
    float courseEUR;
    float courseRUB;

    public Exchanger(String name, String adress, float courseUSD, float courseEUR, float courseRUB) {
        super(name, adress);
        this.courseUSD = courseUSD;
        this.courseEUR = courseEUR;
        this.courseRUB = courseRUB;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Dollar Course: " + courseUSD);
        System.out.println("Euro Course: " + courseEUR);
        System.out.println("Ruble Course: " + courseRUB);
    }

    @Override
    public void exchangeToAnotherValue(float money, String value) {
        if (value.equalsIgnoreCase("USD")) {
            System.out.println(String.format(" %s exchanged your money to %.2f USD", name, money / courseUSD - 15 / courseUSD));
        } else if (value.equalsIgnoreCase("EUR")) {
            System.out.println(String.format(" %s exchanged your money to %.2f RUB", name, money / courseRUB - 15 / courseRUB));
        } else if (value.equalsIgnoreCase("RUB")) {
            System.out.println(String.format(" %s exchanged your money to %.2f RUB", name, money / courseRUB - 15 / courseRUB));
        } else {
            System.out.println("Seek currency not found");
        }
    }

    @Override
    public void exchangeToUAH(float money, String value) {
        float haveHRN = 0;
        boolean isHaveCurrency = true;
        if (value.equalsIgnoreCase("USD")) {
            haveHRN = money*courseUSD;
        } else if (value.equalsIgnoreCase("EUR")) {
            haveHRN = money*courseEUR;
        } else if (value.equalsIgnoreCase("RUB")) {
            haveHRN = money*courseRUB;
        } else {
            isHaveCurrency = false;
            System.out.println("Your currency not found");
        }
        if (isHaveCurrency){
            System.out.println(String.format(" %s exchanged your money to %.2f UAH", name, haveHRN - 15));
        }
    }
}
