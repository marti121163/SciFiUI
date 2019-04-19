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

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the capacity
     */
    public String getCapacity() {
        return capacity;
    }

    /**
     * @param capacity the capacity to set
     */
    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    /**
     * @return the weight
     */
    public String getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(String weight) {
        this.weight = weight;
    }

    /**
     * @return the noOfPrvFlights
     */
    public String getNoOfPrvFlights() {
        return noOfPrvFlights;
    }

    /**
     * @param noOfPrvFlights the noOfPrvFlights to set
     */
    public void setNoOfPrvFlights(String noOfPrvFlights) {
        this.noOfPrvFlights = noOfPrvFlights;
    }

    /**
     * @return the safetyLevel
     */
    public String getSafetyLevel() {
        return safetyLevel;
    }

    /**
     * @param safetyLevel the safetyLevel to set
     */
    public void setSafetyLevel(String safetyLevel) {
        this.safetyLevel = safetyLevel;
    }

    /**
     * @return the manufactureYear
     */
    public String getManufactureYear() {
        return manufactureYear;
    }

    /**
     * @param manufactureYear the manufactureYear to set
     */
    public void setManufactureYear(String manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    /**
     * @return the airplaneSpeed
     */
    public String getAirplaneSpeed() {
        return airplaneSpeed;
    }

    /**
     * @param airplaneSpeed the airplaneSpeed to set
     */
    public void setAirplaneSpeed(String airplaneSpeed) {
        this.airplaneSpeed = airplaneSpeed;
    }

}    