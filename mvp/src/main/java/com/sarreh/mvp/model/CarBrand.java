package com.sarreh.mvp.model;

public class CarBrand {
    private String brand;
    private CarModel model;

    public CarBrand(String brand, com.sarreh.mvp.model.CarModel model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public CarModel getModel() {
        return model;
    }

    public void setModel(CarModel model) {
        this.model = model;
    }
}
