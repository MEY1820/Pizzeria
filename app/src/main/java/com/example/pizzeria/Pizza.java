package com.example.pizzeria;

public class Pizza {

    double pizza_size_price;
    double jamón_price = 0;
    double pollo_price = 0;
    double piña_price = 0;
    double carne_price = 0;
    double peperoni_price = 0;
    double hongos_price = 0;
    double aceitunas_price= 0;

    public Pizza() {
    }

    public double getPizza_size_price() {
        return pizza_size_price;
    }

    public void setPizza_size_price(double pizza_size_price) {
        this.pizza_size_price = pizza_size_price;
    }

    public double getJamón_price() {
        return jamón_price;
    }

    public void setJamón_price(double jamón_price) {
        this.jamón_price = jamón_price;
    }

    public double getPollo_price() {
        return pollo_price;
    }

    public void setPollo_price(double pollo_price) {
        this.pollo_price = pollo_price;
    }

    public double getPiña_price() {
        return piña_price;
    }

    public void setPiña_price(double piña_price) {
        this.piña_price = piña_price;
    }

    public double getCarne_price() {
        return carne_price;
    }

    public void setCarne_price(double carne_price) {
        this.carne_price = carne_price;
    }

    public double getPeperoni_price() {
        return peperoni_price;
    }

    public void setPeperoni_price(double peperoni_price) {
        this.peperoni_price = peperoni_price;
    }

    public double getHongos_price() {
        return hongos_price;
    }

    public void setHongos_price(double hongos_price) {
        this.hongos_price = hongos_price;
    }

    public double getAceitunas_price() {
        return aceitunas_price;
    }

    public void setAceitunas_price(double aceitunas_price) {
        this.aceitunas_price = aceitunas_price;
    }
}
