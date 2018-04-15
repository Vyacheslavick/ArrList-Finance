package com.company.organization;

import com.company.Organization;
import com.company.organization.interFace.Sender;

public class Post extends Organization implements Sender {
    public Post(String name, String adress) {
        super(name, adress);
    }

    @Override
    public void send(float send, String currency) {
        double commission = send*0.02;
        System.out.println(String.format("You send %f ", send - commission));
        System.out.println(String.format("Your commission: %.2f ", commission));
    }
}
