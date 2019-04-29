package ie.tudublin;

import processing.core.PApplet;
import processing.core.PImage;

public class Airplanes 
{
    UI ui;
    private float x;
    private float y;
    private float width;
    private float length;
    private String name;
    private Airports startingAirport;
    private Airports destinationAirport;


    // airplane details
    private String model;
    private String capacity;
    private String weight;
    private String noOfPrvFlights;
    private String safetyLevel;
    private String manufactureYear;
    private int airplaneSpeed;
    //private PImage airplaneIcon;


    public Airplanes(UI ui, String model, String capacity, String weight, 
    String noOfPrvFlights, String safetyLevel, String manufactureYear, int airplaneSpeed) 
    {
        // airplane selection & info
        this.model = model;
        this.capacity = capacity;
        this.weight = weight;
        this.noOfPrvFlights = noOfPrvFlights;
        this.safetyLevel = safetyLevel;
        this.manufactureYear = manufactureYear;
        this.airplaneSpeed = airplaneSpeed;
        //this.airplaneIcon = airplaneIcon;

        this.ui = ui;
    }

    public void render() {


        //int height = 30;
        //ui.noFill();
        // ui.fill(255, 255, 255);
        // ui.stroke(0);
        // ui.rect(x, y, width, height);
        // ui.textAlign(PApplet.CENTER, PApplet.CENTER);
        // ui.fill(0);
        // ui.textSize(15);
        // ui.text(name, x + width * 0.5f, y + height * 0.5f);

        // if (ui.overRect((int)x, (int)y, (int)width, (int)height)) {
        //     ui.fill(230);
        //     ui.rect(x, y, width, height);
        //     ui.fill(0);
        //     ui.text(name, x + width * 0.5f, y + height * 0.5f);
        // }
    }

    public void setVariables(Airports startingAirport, int width, int height) {
        this.startingAirport = startingAirport;
        this.x = startingAirport.getX() + startingAirport.getWidth() / 2;
        this.y = startingAirport.getY() - startingAirport.getHeight();
        this.width = width;
        this.length = 35;
    }
    
    public void draw() {
        ui.stroke(255);
        //ui.noFill();
        ui.fill(80);
        // body and tip
        ui.rect(x - width/2, y - length/2, width, length);
        ui.triangle(x - width/2, y - length/2, x, y - length/2 - width, x + width/2, y - length/2);
        // ui.line(x - width/2, y - length/2, x, y - length/2 - width);
        // ui.line(x + width/2, y - length/2, x, y - length/2 - width);

        //wings
        float leftWingX = x - length;
        float WingY = y + length/2;
        float rightWingX = x + length;
        
        ui.triangle(x - width/2, y - length/4, leftWingX, WingY, leftWingX + (length/3)*2, WingY - length/4);
        ui.triangle(x + width/2, y - length/4, rightWingX, WingY, rightWingX - (length/3)*2, WingY - length/4);
        ui.triangle(x - width/2, y - length/4, leftWingX + (length/3)*2, WingY - length/4, x - width/2, WingY - length/4);
        ui.triangle(x + width/2, y - length/4, rightWingX - (length/3)*2, WingY - length/4, x + width/2, WingY - length/4);

        // ui.line(x - width/2, y - length/4, leftWingX, WingY);
        // ui.line(x + width/2, y - length/4, rightWingX, WingY);
        // ui.line(leftWingX, WingY, leftWingX + (length/3)*2, WingY - length/4);
        // ui.line(rightWingX, WingY, rightWingX - (length/3)*2, WingY - length/4);
        // ui.line(leftWingX + (length/3)*2, WingY - length/4, x - width/2, WingY - length/4);
        // ui.line(rightWingX - (length/3)*2, WingY - length/4, x + width/2, WingY - length/4);

        // back
        ui.triangle(x - width/2, y + length/2, x, y + length/2 + width, x + width/2, y + length/2);
        // ui.line(x - width/2, y + length/2, x, y + length/2 + width);
        // ui.line(x + width/2, y + length/2, x, y + length/2 + width);

        // back wings
        float backPointY = y + length/2 + width;
        // ui.line(x, backPointY, x + length/3, backPointY + width/2);
        // ui.line(x, backPointY - width/2, x + length/3, backPointY);

        // ui.line(x, backPointY, x - length/3, backPointY + width/2);
        // ui.line(x, backPointY - width/2, x - length/3, backPointY);

        ui.quad(x, backPointY, x, backPointY - width/2, x + length/3, backPointY, x + length/3, backPointY + width/2);
        ui.quad(x, backPointY, x, backPointY - width/2, x - length/3, backPointY, x - length/3, backPointY + width/2);
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
    public int getAirplaneSpeed() {
        return airplaneSpeed;
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
     * @return the startingAirport
     */
    public Airports getStartingAirport() {
        return startingAirport;
    }

    /**
     * @param startingAirport the startingAirport to set
     */
    public void setStartingAirport(Airports startingAirport) {
        this.startingAirport = startingAirport;
    }

    /**
     * @return the destinationAirport
     */
    public Airports getDestinationAirport() {
        return destinationAirport;
    }

    /**
     * @param destinationAirport the destinationAirport to set
     */
    public void setDestinationAirport(Airports destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    /**
     * @param airplaneSpeed the airplaneSpeed to set
     */
    public void setAirplaneSpeed(int airplaneSpeed) {
        this.airplaneSpeed = airplaneSpeed;
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
     * @return the length
     */
    public float getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(float length) {
        this.length = length;
    }

    // /**
    //  * @return the airplaneIcon
    //  */
    // public PImage getAirplaneIcon() {
    //     return airplaneIcon;
    // }

    // /**
    //  * @param airplaneIcon the airplaneIcon to set
    //  */
    // public void setAirplaneIcon(PImage airplaneIcon) {
    //     this.airplaneIcon = airplaneIcon;
    // }

}    