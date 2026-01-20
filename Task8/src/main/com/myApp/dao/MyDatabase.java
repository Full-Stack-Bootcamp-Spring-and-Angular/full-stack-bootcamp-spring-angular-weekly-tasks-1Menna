package main.com.myApp.dao;

import main.com.myApp.Models.UserModel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.sql.*;

@Component
public class MyDatabase {
    @Value("${database.url}")
    String url;
    @Value("${database.username}")
    String username;
    @Value("${database.password}")
    String password;

    PreparedStatement ps;
    Connection con;

    @PostConstruct
    public void ConnectToDatabase(){
        try{
            Driver myDriver = new com.mysql.jdbc.Driver();
            DriverManager.registerDriver( myDriver );

            System.out.println("Connection Started successfully...");

        }catch (SQLException e){
            System.out.println(e.getStackTrace());
        }

    }
    //=====================================================
    public void InsertIntoToDatabase(UserModel userModel){
        try{
            con = DriverManager.getConnection(url,username,password);

            String Sql = "insert into employee (userName,password,email) values(?,?,?) ";

            ps = con.prepareStatement(Sql);

            ps.setString(1,userModel.getUserName());
            ps.setString(2,userModel.getPassword());
            ps.setString(3,userModel.getEmail());

            ps.executeUpdate();
        }catch (SQLException e){
            System.out.println(e.getStackTrace());
        }
    }
    //=====================================================
    @PreDestroy
    public void DisConnectFromDatabase(){
        try{
            con.close();
            ps.close();
        }catch (SQLException e){
            System.out.println(e.getStackTrace());
        }

        System.out.println("Connection Closed successfully...");
    }


}
