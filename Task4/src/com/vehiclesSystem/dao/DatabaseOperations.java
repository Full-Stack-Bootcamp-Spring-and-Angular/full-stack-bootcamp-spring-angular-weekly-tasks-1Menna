package com.vehiclesSystem.dao;
import com.vehiclesSystem.models.Type;
import com.vehiclesSystem.models.Vehicle;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.sql.*;
import java.util.List;

@Scope("singleton")
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
        try
        {
            Driver myDriver = new com.mysql.jdbc.Driver();
            DriverManager.registerDriver( myDriver );
            
            System.out.println("Connection Started successfully...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //========================================================================
    public void InsertIntoDatabase(Vehicle vehicle){
        try(Connection con = DriverManager.getConnection(url,username,password);
            Statement stm = con.createStatement();)
        {
            String Sql = String.format("INSERT INTO vehicles (id, model, type) VALUES (%d,%s,\"%s\"); ",vehicle.getId(),vehicle.getModel(),vehicle.getType().toString());
            stm.executeUpdate(Sql);
            System.out.println(String.format("row (%d,%s,%s) inserted successfully...",vehicle.getId(),vehicle.getModel(),vehicle.getType().toString()));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //========================================================================
    public void DeleteFromDatabase(int id){
        try(Connection con = DriverManager.getConnection(url,username,password);
            Statement stm = con.createStatement();)
        {
            String Sql = String.format("DELETE FROM vehicles WHERE id = %d",id);
            stm.executeUpdate(Sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //========================================================================
    public void UpdateVehicleInDatabase(int id,String model, String type){
        try(Connection con = DriverManager.getConnection(url,username,password);
            Statement stm = con.createStatement();)
        {
            String Sql = String.format("UPDATE vehicles SET model = \"%s\" , type = \"%s\" Where id = %d",model,type,id);
            stm.executeUpdate(Sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //========================================================================
    public void SearchByIdInDatabase(int id){
        try(Connection con = DriverManager.getConnection(url,username,password);
            Statement stm = con.createStatement();)
        {
            String Sql = String.format("Select * from vehicles WHERE id = %d",id);
            ResultSet rs = stm.executeQuery(Sql);
            while(rs.next()){
                //Display values
                System.out.println(String.format("%d, %s, %s",rs.getInt("id"),rs.getString("model"),rs.getString("type")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //========================================================================
    public void GetAllVehiclesinDatabase(){
        try(Connection con = DriverManager.getConnection(url,username,password);
            Statement stm = con.createStatement();)
        {
            String Sql = String.format("Select * from vehicles");
            ResultSet rs = stm.executeQuery(Sql);
            while(rs.next()){
                //Display values
                System.out.println(String.format("%d, %s, %s",rs.getInt("id"),rs.getString("model"),rs.getString("type")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //========================================================================
    @PreDestroy
    public void disconnectFromDatabase(){
        System.out.println("Connection Closed successfully...");
    }
}


/*
======== What Done in mySQL =========
_____________________________________
create database VehicleSystem;
_____________________________________
use VehicleSystem;
create table Vehicles(
id int,
model varchar(255),
type varchar(255)
);
_____________________________________
use VehicleSystem;
show tables;
_____________________________________
insert into Vehicles values(1,"2016","car");
_____________________________________
select * from Vehicles
_____________________________________
* */