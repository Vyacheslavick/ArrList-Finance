package com.company;

public class Organization {
    public String name;
    public String adress;

    public Organization(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }
    public void print(){
        System.out.println("");
        System.out.println("Organization's name: " + name);
        System.out.println(String.format("%s adress: %s", name, adress));
    }
}
