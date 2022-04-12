package com.company;

public class Truck extends Vehicle{


    public Truck(String modelName, int wheelsCount) {
       super(modelName, wheelsCount);
    }

    public String getModelName() {
        return super.getModelName();
    }

    public int getWheelsCount() {
        return super.getWheelsCount();
    }

    public void setModelName(String modelName) {
        super.setModelName(modelName);
    }

    public void setWheelsCount(int wheelsCount) {
        super.setWheelsCount(wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
