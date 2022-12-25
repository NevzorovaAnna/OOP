package org.example;

public class AnotherCoffee implements Printable {
    private final int id;
    private int cost;

    public AnotherCoffee(int id, int cost) {
        this.id = id;
        this.cost = cost;
    }

    @Override
    public void getInfo() {
        System.out.println("Кофе " + (id + 1) + ": стоимость - " + cost + ".");
    }

    public int getCost() {
        return cost;
    }
    public int getId() {
        return id;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}

