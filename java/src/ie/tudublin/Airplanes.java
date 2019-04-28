package ie.tudublin;

import processing.core.PApplet;
import processing.core.PImage;

public class Airplanes 
{
    UI ui;
    private float x;
    private float y;
    private float width;
    private float height;
    private String name; 

    // airplane details
    private String model;
    private String capacity;
    private String weight;
    private String noOfPrvFlights;
    private String safetyLevel;
    private String manufactureYear;
    private String airplaneSpeed;
    private PImage airplaneIcon;


    public Airplanes(String model, String capacity, String weight, 
    String noOfPrvFlights, String safetyLevel, String manufactureYear, String airplaneSpeed, PImage airplaneIcon) 
    {
        // airplane selection & info
        this.model = model;
        this.capacity = capacity;
        this.weight = weight;
        this.noOfPrvFlights = noOfPrvFlights;
        this.safetyLevel = safetyLevel;
        this.manufactureYear = manufactureYear;
        this.airplaneSpeed = airplaneSpeed;
        this.airplaneIcon = airplaneIcon;

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

	public void render() {
        //ui.noFill();
        ui.fill(255, 255, 255);
        ui.stroke(0);
        ui.rect(x, y, width, height);
        ui.textAlign(PApplet.CENTER, PApplet.CENTER);
        ui.fill(0);
        ui.textSize(15);
        ui.text(name, x + width * 0.5f, y + height * 0.5f);

        if (ui.overRect((int)x, (int)y, (int)width, (int)height)) {
            ui.fill(230);
            ui.rect(x, y, width, height);
            ui.fill(0);
            ui.text(name, x + width * 0.5f, y + height * 0.5f);
        }
	}

    /**
     * @return the ui
     */
    public UI getUi() {
        return ui;
    }

    /**
     * @param ui the ui to set
     */
    public void setUi(UI ui) {
        this.ui = ui;
    }

    /**
     * @return the x
     */
    public float getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(float x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public float getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(float y) {
        this.y = y;
    }

    /**
     * @return the width
     */
    public float getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(float width) {
        this.width = width;
    }

    /**
     * @return the height
     */
    public float getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(float height) {
        this.height = height;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the airplaneIcon
     */
    public PImage getAirplaneIcon() {
        return airplaneIcon;
    }

    /**
     * @param airplaneIcon the airplaneIcon to set
     */
    public void setAirplaneIcon(PImage airplaneIcon) {
        this.airplaneIcon = airplaneIcon;
    }

}    