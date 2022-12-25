package org.example;

public class Coffee implements Printable {
    protected static int n;
    public int id;
    public int cost;
    public int water;
    public int zerna;
    public int zakaz;

    public Coffee(int cost, int water, int zerna, int zakaz){
        this.id = ++n;
        this.cost = cost;
        this.water = water;
        this.zerna = zerna;
        this.zakaz = zakaz;

    }

    protected Coffee() {
    }

    @Override
    public void getInfo() {
        System.out.println("Кофе " + id + ": стоимость - " + cost + ", вода - " + water + ", зёрна - " + zerna + ", заказы - " + zakaz);
    }

    public int getCost() {
        return cost;
    }
    public int getWater() {
        return water;
    }
    public int getZerna() {
        return zerna;
    }
    public int getZakaz() {
        return zakaz;
    }
    public int getId() {
        return id;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
    public void setWater(int water) {
        this.water = water;
    }
    public void setZerna(int zerna) {
        this.zerna = zerna;
    }
    public void setZakaz(int zakaz) {
        this.zakaz = zakaz;
    }
}

