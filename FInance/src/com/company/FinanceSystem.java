package com.company;

import com.company.organization.interFace.Creditor;
import com.company.organization.interFace.Exchange;
import com.company.organization.interFace.Investor;
import com.company.organization.interFace.Sender;

import java.util.ArrayList;

public class FinanceSystem {
    ArrayList<Organization> list;
    public FinanceSystem(ArrayList list){
        this.list = list;
    }
    public void exOrganizationsToCurrency(float money, String value) {
        for (Organization organizations: list) {
            if (organizations instanceof Exchange){
                System.out.println(String.format("%s exchange for you:", organizations.name));
                ((Exchange) organizations).exchangeToAnotherValue(money, value);
            }
        }
    }
    public void exOrganizationsToUAH(float money, String value){
         for (Organization organizations: list) {
            if (organizations instanceof Exchange){
                System.out.println(String.format("%s exchange for you:", organizations.name));
                ((Exchange) organizations).exchangeToUAH(money, value);
            }
        }
    }
    public void sendCash(float money, String currency){
        for (Organization organizations: list) {
            if (organizations instanceof Sender){
                System.out.println(String.format("%s send:", organizations.name));
                ((Sender) organizations).send(money, currency);
            }
        }
    }
    public void takeLoan(float money){
        for (Organization organizations: list) {
            if (organizations instanceof Creditor){
                System.out.println(String.format("%s give you:", organizations.name));
                ((Creditor) organizations).credit(money);
            }
        }
    }
    public void putDeposit(float money){
        for (Organization organizations: list) {
            if (organizations instanceof Investor){
                ((Investor) organizations).deposite(money);
            }
        }
    }
}
