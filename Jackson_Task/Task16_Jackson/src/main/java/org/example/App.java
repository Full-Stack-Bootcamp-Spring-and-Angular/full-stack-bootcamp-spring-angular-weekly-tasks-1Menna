package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;

public class App
{
    public static void main( String[] args ) throws IOException {
        // Create Mapper Object
        ObjectMapper mapper = new ObjectMapper();

        // Convert JSON to Java
        Student student = mapper.readValue(new File("input.json"),Student.class);
        System.out.println(student.getId() + student.getName());

        //=====================================================================================
        // Convert Java to JSON

        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        mapper.writeValue(new File("output.json"),student);
    }
}
