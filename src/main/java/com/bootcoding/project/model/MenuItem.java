package com.bootcoding.project.model;

public class MenuItem {
    int id;
    String meunName;
    boolean isVeg;
    double price;
    String flavour;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMeunName() {
        return meunName;
    }

    public void setMeunName(String meunName) {
        this.meunName = meunName;
    }

    public boolean isVeg() {
        return isVeg;
    }

    public void setVeg(boolean veg) {
        isVeg = veg;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }
}
