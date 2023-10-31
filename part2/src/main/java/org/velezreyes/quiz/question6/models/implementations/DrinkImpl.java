package org.velezreyes.quiz.question6.models.implementations;

import org.velezreyes.quiz.question6.models.Drink;


public class DrinkImpl implements Drink {
    private String name;
    private boolean fizzy;
    private double price;

    public DrinkImpl(String name) {
        this.name = name;
        this.fizzy = false;
        this.price = 0;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setFizzy(boolean fizzy) {
        this.fizzy = fizzy;
    }

    @Override
    public boolean isFizzy() {
        return this.fizzy;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
