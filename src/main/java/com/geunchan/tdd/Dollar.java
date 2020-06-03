package com.geunchan.tdd;

public class Dollar {

    public  int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int number) {
        return new Dollar(amount * number);
    }
}
