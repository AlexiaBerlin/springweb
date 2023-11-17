package com.springweb.model;

public class Car{
  private int carId;
  private String manufacture;
  private int model;

  public int getCarId() {
    return carId;
  }
  public void setCarId(int carId) {
    this.carId = carId;
  }
  public String getManufacture() {
    return manufacture;
  }
  public void setManufacture(String manufacture) {
    this.manufacture = manufacture;
  }
  public int getModel() {
    return model;
  }
  public void setModel(int model) {
    this.model = model;
  }
  @Override
  public String toString(){
    return "Car [cardId=" + this.carId + ", manufacture=" + this.manufacture + ", model=" + this.model +"]";
  }


}
