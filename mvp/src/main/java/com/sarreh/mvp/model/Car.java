package com.sarreh.mvp.model;

public class Car {
    private CarBrand brand;
    private String year;
    private String numberPlate;
    private String acquireYear;
    private String productionYear;

    public CarBrand getBrand() {
        return brand;
    }

    public void setBrand(CarBrand brand) {
        this.brand = brand;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
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
}
