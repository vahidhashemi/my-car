package com.sarreh.mvp.model;

public class CarBrand {
    private String brand;
    private CarModel model;
    private int id;

    public CarBrand(String brand, com.sarreh.mvp.model.CarModel model, int id) {
        this.brand = brand;
        this.model = model;
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
