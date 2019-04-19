package ie.tudublin;

import processing.core.PApplet;

public class Airplanes 
{


    // airplane details
    private String model;
    private String capacity;
    private String weight;
    private String noOfPrvFlights;
    private String safetyLevel;
    private String manufactureYear;
    private String airplaneSpeed;


    public Airplanes(String model, String capacity, String weight, 
    String noOfPrvFlights, String safetyLevel, String manufactureYear, String airplaneSpeed) 
    {
        // airplane selection & info
        this.model = model;
        this.capacity = capacity;
        this.weight = weight;
        this.noOfPrvFlights = noOfPrvFlights;
        this.safetyLevel = safetyLevel;
        this.manufactureYear = manufactureYear;
        this.airplaneSpeed = airplaneSpeed;

    }

}    