package com.databaseOperation;

public class DatabaseOperation {
    // Properties
    private String url;
    private String username;
    private String password;


    // Setters
    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    // Methods
    public void storeIntoDataBase(String VehicleName){
        System.out.println(String.format("connecting to Database With Url = %s, Username =  %s, Password = %s",url,username,password));
        System.out.println(String.format("%s stored into Database",VehicleName));
    }


}
