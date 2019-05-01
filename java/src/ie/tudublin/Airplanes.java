package ie.tudublin;

import processing.core.PApplet;
import processing.core.PVector;
// import processing.core.PApplet;
// import processing.core.PImage;

public class Airplanes 
{
    UI ui;
    private PVector pos;
    private float width;
    private float length;
    private String name;
    private Airports startingAirport;
    private Airports destinationAirport;
    //private Airports airport = 
    private Pilots pilot;
    private float rotation;
    private String airplaneColour;

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

    }

    // this sets the starting airport coordinates so the plane knows where to fly from
    // this method is called once you generate an airplane
    public void setVariables(Airports startingAirport, int width, int height, Pilots pilot) {
        this.startingAirport = startingAirport;
        float x = startingAirport.getX() + startingAirport.getWidth() / 2;
        float y = startingAirport.getY() + startingAirport.getHeight() * (float)1.5;
        pos = new PVector(x, y);
        this.width = width;
        this.length = 35;
        this.pilot = pilot;
    }

    public void update()
    {
        int x = (int)(destinationAirport.getX() + destinationAirport.getWidth() / 2);
        int y = (int)(destinationAirport.getY() + destinationAirport.getHeight() * (float)1.5);
        PVector dest = new PVector(x, y);
        PVector nextPoint = PVector.sub(dest, pos);
        float dist = nextPoint.mag();
        nextPoint.normalize(); // gets a single unit so, moving the plane one unit in a certain direction is possible
        pos.add(nextPoint);
        rotation = (float) Math.atan2(nextPoint.y, nextPoint.x) + PApplet.HALF_PI;

        // gets rid of the airplane once it has reached its destination
        if (dist < 1)
        {
            ui.removePlane(this);
            destinationAirport = null;
        }

        
    }
    
    public void draw() {
        // draw line between source and destination
        ui.stroke(255, 0, 0);
        if (destinationAirport != null) {
            ui.line(startingAirport.getX() + startingAirport.getWidth() / 2, startingAirport.getY() + startingAirport.getHeight() * (float)1.5, destinationAirport.getX() + destinationAirport.getWidth() / 2, destinationAirport.getY() + destinationAirport.getHeight() * (float)1.5);
        }

        if (destinationAirport != null) {
            update();
        }

        float x = 0;
        float y = 0;
    
        ui.stroke(255);

        ui.pushMatrix();

        // lets you change the colour of all currently generated planes
        if (ui.selectedColour == 1){
            ui.fill(255, 0, 0);
        } else if (ui.selectedColour == 2){
            ui.fill(0, 0, 255);
        } else if (ui.selectedColour == 3){
            ui.fill(0, 255, 0);
        } else if (ui.selectedColour == 4){
            ui.fill(80);
        } else {
            ui.fill(80);
        }
        // this is needed because otherwise the airplane will get drawn at 0, 0 where the rotation is done
        ui.translate(pos.x, pos.y);
        ui.rotate(rotation);

        // body and tip
        ui.rect(x - width/2, y - length/2, width, length);
        ui.triangle(x - width/2, y - length/2, x, y - length/2 - width, x + width/2, y - length/2);
        //wings
        float leftWingX = x - length;
        float WingY = y + length/2;
        float rightWingX = x + length;
        ui.triangle(x - width/2, y - length/4, leftWingX, WingY, leftWingX + (length/3)*2, WingY - length/4);
        ui.triangle(x + width/2, y - length/4, rightWingX, WingY, rightWingX - (length/3)*2, WingY - length/4);
        ui.triangle(x - width/2, y - length/4, leftWingX + (length/3)*2, WingY - length/4, x - width/2, WingY - length/4);
        ui.triangle(x + width/2, y - length/4, rightWingX - (length/3)*2, WingY - length/4, x + width/2, WingY - length/4);
        // back
        ui.triangle(x - width/2, y + length/2, x, y + length/2 + width, x + width/2, y + length/2);
        // back wings
        float backPointY = y + length/2 + width;
        ui.quad(x, backPointY, x, backPointY - width/2, x + length/3, backPointY, x + length/3, backPointY + width/2);
        ui.quad(x, backPointY, x, backPointY - width/2, x - length/3, backPointY, x - length/3, backPointY + width/2);
        
        ui.popMatrix();
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

    /**
     * @return the pos
     */
    public PVector getPos() {
        return pos;
    }

    /**
     * @param pos the pos to set
     */
    public void setPos(PVector pos) {
        this.pos = pos;
    }

    /**
     * @return the rotation
     */
    public float getRotation() {
        return rotation;
    }

    /**
     * @param rotation the rotation to set
     */
    public void setRotation(float rotation) {
        this.rotation = rotation;
    }

    /**
     * @return the pilot
     */
    public Pilots getPilot() {
        return pilot;
    }

    /**
     * @param pilot the pilot to set
     */
    public void setPilot(Pilots pilot) {
        this.pilot = pilot;
    }

    // /**
    //  * @return the airplane
    //  */
    // public Airplanes getAirplane() {
    //     return airplane;
    // }

    // /**
    //  * @param airplane the airplane to set
    //  */
    // public void setAirplane(Airplanes airplane) {
    //     this.airplane = airplane;
    // }

    /**
     * @return the airplaneColour
     */
    public String getAirplaneColour() {
        return airplaneColour;
    }

    /**
     * @param airplaneColour the airplaneColour to set
     */
    public void setAirplaneColour(String airplaneColour) {
        this.airplaneColour = airplaneColour;
    }
}    