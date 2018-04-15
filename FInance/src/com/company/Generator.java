package com.company;

import com.company.organization.*;

import java.util.ArrayList;

public class Generator {
    public static ArrayList<Organization> generate(){
        ArrayList<Organization> list = new ArrayList<>(9);
    list.add(0, new Bank("Hope", "Kuba", 26.5f, 0.445f, 32.3f, 1965, 12000));
    list.add(1, new Bank("Hell", "Tenth circle", 26.7f, 0.46f, 33f, 1999, 12000));
    list.add(2, new Credits("Coffeshka", "Inferno", 4000, 2));
    list.add(3, new Credits("USSR", "Syberia", 100000, 1.2f ));
    list.add(4, new Credits("Blago", "Chernishevskogo 21", 50000, 1.4f));
    list.add(5, new Exchanger("Obmenka", "Baraban", 26.6f, 32.1f, 0.45f));
    list.add(6, new Exchanger("TradeYourMoney", "Himalai", 26.8f, 32.4f, 0.55f));
    list.add(7, new PIF("PIF", "Paf", 1990));
    list.add(8, new Post("UKRPost","Everest"));
    return list;
    }
}
