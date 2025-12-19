package com.databaseOperation;

public class Car implements Vehicle{
    DatabaseOperation databaseOperation;

    public Car(DatabaseOperation databaseOperation) {
        this.databaseOperation = databaseOperation;
    }

    public void storeVehicle(){
        databaseOperation.storeIntoDataBase("Car");
    }
}
