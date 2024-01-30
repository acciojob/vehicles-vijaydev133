package com.driver;

public  class Boat implements WaterVehicle{
    String name;
    int capacity;
    public Boat(String name,int capacity){
        this.name=name;
        this.capacity=capacity;

    }

    public void setVehicleName(String name) {
        this.name = name;
    }

    public void setVehicleCapacity(int capacity) {
        this.capacity = capacity;
    }



    @Override
    public String getVehicleName(){
        return this.name;
    }

     @Override
     public int getVehicleCapacity()
        {
        return this.capacity ;
    }

}