package com.vehiclesSystem.controller;

import com.vehiclesSystem.models.Vehicle;

import java.util.List;

public interface VehicleController {
    public void SaveVehicle(Vehicle vehicle);
    public void DeleteVehicle(int id);
    public void UpdateVehicle(int id,String model, String type);
    public void SearchById(int id);
    public void GetAllVehicles();
}
