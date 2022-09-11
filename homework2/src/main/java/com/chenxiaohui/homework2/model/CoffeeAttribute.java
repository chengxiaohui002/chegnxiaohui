package com.chenxiaohui.homework2.model;

public class CoffeeAttribute {
    private String countryOfOrigin;
    private String coffeeName;
    private String farm;
    private String manufacturer;

    public CoffeeAttribute(String countryOfOrigin, String coffeeName, String farm, String manufacturer) {
        this.countryOfOrigin = countryOfOrigin;
        this.coffeeName = coffeeName;
        this.farm = farm;
        this.manufacturer = manufacturer;
    }

    public CoffeeAttribute() {
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public void setCoffeeName(String coffeeName) {
        this.coffeeName = coffeeName;
    }

    public String getFarm() {
        return farm;
    }

    public void setFarm(String farm) {
        this.farm = farm;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "CoffeeAttribute{" +
                "countryOfOrigin=" + countryOfOrigin +
                "coffeeName="+ coffeeName +
                ", farm=" + farm +
                ", manufacturer=" + manufacturer +
                '}';
    }
}
