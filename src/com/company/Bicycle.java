package com.company;

import com.company.ServiceStation;

public class Bicycle extends Vehicle {


    public Bicycle(String modelName,int wheelsCount) {
      super(modelName,wheelsCount);
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
}
