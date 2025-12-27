package com.vehiclesSystem;

import com.vehiclesSystem.config.config;
import com.vehiclesSystem.controller.BikeController;
import com.vehiclesSystem.controller.CarController;
import com.vehiclesSystem.controller.PlaneController;
import com.vehiclesSystem.models.Bike;
import com.vehiclesSystem.models.Car;
import com.vehiclesSystem.models.Plane;
import com.vehiclesSystem.models.Type;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(config.class);

//        // Save Vehicle
//        Car car = container.getBean("car",Car.class);
//        car.setId(1);
//        car.setModel("2016");
//        car.setType(Type.Car);
//        CarController carController = container.getBean("carController",CarController.class);
//        carController.SaveVehicle(car);
//
//        Plane plane = container.getBean("plane",Plane.class);
//        plane.setId(2);
//        plane.setModel("2020");
//        plane.setType(Type.Plane);
//        PlaneController planeController = container.getBean("planeController",PlaneController.class);
//        planeController.SaveVehicle(plane);
//
//        Bike bike = container.getBean("bike",Bike.class);
//        bike.setId(3);
//        bike.setModel("2025");
//        bike.setType(Type.Bike);
//        BikeController bikeController = container.getBean("bikeController",BikeController.class);
//        bikeController.SaveVehicle(bike);
//        // =====================================================================================================

//        // Delete Vehicle
//        CarController carController = container.getBean("carController",CarController.class);
//        carController.DeleteVehicle(3);
//        // =====================================================================================================

//        // UpdateVehicle
//        CarController carController = container.getBean("carController",CarController.class);
//        carController.UpdateVehicle(2,"2001","Car");
//        // =====================================================================================================

//        // SearchById
//        CarController carController = container.getBean("carController",CarController.class);
//        carController.SearchById(2);
//        // =====================================================================================================

//        // GetAllVehicles
//        CarController carController = container.getBean("carController",CarController.class);
//        carController.GetAllVehicles();
        // =====================================================================================================

        ((AnnotationConfigApplicationContext)container).close();
    }
}