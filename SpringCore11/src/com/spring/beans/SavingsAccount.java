package com.spring.beans;

public class SavingsAccount implements Account{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void createAccount() {
        System.out.println("Savings Account Created");
    }

    @Override
    public void searchAccount() {
        System.out.println("Savings Account Searched");
    }

    @Override
    public void deleteAccount() {
        System.out.println("Savings Account Deleted");
    }

    @Override
    public void updateAccount() {
        System.out.println("Savings Account Updated");
    }
}
