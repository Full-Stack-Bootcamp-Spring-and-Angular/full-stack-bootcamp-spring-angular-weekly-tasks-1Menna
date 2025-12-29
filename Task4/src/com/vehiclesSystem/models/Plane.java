package com.vehiclesSystem.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component
@Setter
@Getter
public class Plane implements  Vehicle{
    int id;
    String model;
    Type type;

}
