package com.company.organization;

import com.company.organization.interFace.Investor;
import com.company.Organization;

public class PIF extends Organization implements Investor {
    int year;

    public PIF(String name, String adress, int year) {
        super(name, adress);
        this.year = year;
    }

    @Override
    public void deposite(float investition) {
        System.out.println(String.format(" You give %.2f to %s ", investition, name));
        System.out.println(String.format(" In a year you will receive %.2f", investition * 1.2));
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Licence year: " + year);
    }
}
