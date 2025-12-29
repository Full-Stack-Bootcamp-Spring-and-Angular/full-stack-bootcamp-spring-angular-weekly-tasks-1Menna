package com.vehiclesSystem.controller;

import com.vehiclesSystem.dao.DatabaseOperations;
import com.vehiclesSystem.models.Plane;
import com.vehiclesSystem.models.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PlaneController implements VehicleController{
    DatabaseOperations databaseOperations;

    @Autowired
    public void setDatabaseOperations(DatabaseOperations databaseOperations) {
        this.databaseOperations = databaseOperations;
    }

    public void SaveVehicle(Vehicle vehicle){
        databaseOperations.InsertIntoDatabase((Plane)vehicle);
    }
    public void DeleteVehicle(int id){
        databaseOperations.DeleteFromDatabase(id);
        System.out.println("Vehicle Deleted Successfully...");
    }
    public void UpdateVehicle(int id,String model, String type){
        databaseOperations.UpdateVehicleInDatabase(id,model,type);
        System.out.println("Vehicle Updated Successfully...");
    }
    public void SearchById(int id){
        databaseOperations.SearchByIdInDatabase(id);
    }
    public void GetAllVehicles(){
        databaseOperations.GetAllVehiclesinDatabase();
    }
}
