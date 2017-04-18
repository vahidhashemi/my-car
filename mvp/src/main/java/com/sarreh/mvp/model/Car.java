package com.sarreh.mvp.model;

public class Car {
    private CarBrand brand;
    private String numberPlate;
    private String acquireYear;
    private String productionYear;
    private int id;

    public Car(CarBrand brand, String numberPlate, String acquireYear, String productionYear, int id) {
        this.brand = brand;
        this.numberPlate = numberPlate;
        this.acquireYear = acquireYear;
        this.productionYear = productionYear;
        this.id = id;
    }

    public CarBrand getBrand() {
        return brand;
    }

    public void setBrand(CarBrand brand) {
        this.brand = brand;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public String getAcquireYear() {
        return acquireYear;
    }

    public void setAcquireYear(String acquireYear) {
        this.acquireYear = acquireYear;
    }

    public String getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(String productionYear) {
        this.productionYear = productionYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
