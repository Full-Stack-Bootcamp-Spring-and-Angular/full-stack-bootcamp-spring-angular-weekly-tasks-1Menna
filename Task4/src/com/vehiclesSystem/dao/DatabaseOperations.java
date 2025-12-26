package com.vehiclesSystem.dao;
import com.vehiclesSystem.models.Vehicle;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.sql.*;

@Component
public class DatabaseOperations {
    @Value("${database.url}")
    private String url;
    @Value("${database.username}")
    private String username;
    @Value("${database.password}")
    private String password;

    //========================================================================
    @PostConstruct
    public void connectToDatabase(){
        System.out.println("Connection Started successfully...");
    }
    //========================================================================
    public void InsertIntoDatabase(Vehicle vehicle){
        System.out.println(vehicle.getClass());
    }
    //========================================================================
    @PreDestroy
    public void disconnectFromDatabase(){
        System.out.println("Connection Closed successfully...");
    }
    //========================================================================
}
