package com.databaseOperation;

public class Plane implements Vehicle{
    DatabaseOperation databaseOperation;

    public void setDatabaseOperation(DatabaseOperation databaseOperation) {
        this.databaseOperation = databaseOperation;
    }

    public void storeVehicle(){
        databaseOperation.storeIntoDataBase("Plane");
    }
}
