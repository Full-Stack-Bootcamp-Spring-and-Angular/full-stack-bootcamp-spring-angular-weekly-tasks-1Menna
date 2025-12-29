package com.vehiclesSystem.models;

public interface Vehicle {
    public int getId();

    public String getModel();

    public Type getType();

    public void setId(int id);

    public void setModel(String model);

    public void setType(Type type);

}
