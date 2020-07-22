package com.company;

import java.util.ArrayList;

public class Customer {
    private ArrayList<Double> transaction;
    private String name;

    public Customer(String name, double firstMoney) {
        this.transaction = new ArrayList<>() ;
        this.name = name;
        addTransaction(firstMoney);
    }
    public void addTransaction(double amount){
        this.transaction.add(amount);
    }

    public ArrayList<Double> getTransaction() {
        return transaction;
    }

    public String getName() {
        return name;
    }






}
