package com.vehiclesSystem.controller;

import com.vehiclesSystem.dao.DatabaseOperations;
import com.vehiclesSystem.models.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BikeController implements VehicleController{
    @Autowired
    DatabaseOperations databaseOperations;


    public void SaveVehicle(Vehicle vehicle){
        databaseOperations.InsertIntoDatabase(vehicle);
    }
}
