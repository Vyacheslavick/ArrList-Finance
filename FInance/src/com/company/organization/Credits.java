package com.company.organization;

import com.company.Organization;
import com.company.organization.interFace.Creditor;

public class Credits extends Organization implements Creditor {
    float limit;
    float coursce;

    public Credits(String name, String adress, float limit, float coursce) {
        super(name, adress);
        this.limit = limit;
        this.coursce = coursce;
    }

    @Override
    public void credit(float money) {
        double credits = money * coursce;
        if (money <= limit) {
            System.out.println(String.format("%s give you %.2f hrn", name, money));
            System.out.println(String.format("You must return %.2f hrn", credits));
        } else {
            System.out.println(String.format("%s can't give you so much!", name));
        }
    }
}
