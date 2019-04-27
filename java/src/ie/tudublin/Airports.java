package ie.tudublin;

import processing.core.PApplet;
import processing.core.PImage;

public class Airports
{
    UI ui;
    private float x;
    private float y;
    private float width;
    private float height;

    // airport details
    private String name;
    private String location;
    private String ceo;
    private String yearlyPassengers;
    private String yearBuilt;
    private String features;
    private PImage airportIcon;

    public Airports(UI ui, float x, float y, float width, float height, String name, String location, String ceo,
    String yearlyPassengers, String yearBuilt, String features, PImage airportIcon)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.width = width = 145;
        this.height = height = 30;

        // airport info 
        this.name = name;
        this.location = location;
        this.ceo = ceo;
        this.yearlyPassengers = yearlyPassengers;
        this.yearBuilt = yearBuilt;
        this.features = features;
        this.airportIcon = airportIcon;

    }


    public void render()
    {
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
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return the yearlyPassengers
     */
    public String getYearlyPassengers() {
        return yearlyPassengers;
    }

    /**
     * @param yearlyPassengers the yearlyPassengers to set
     */
    public void setYearlyPassengers(String yearlyPassengers) {
        this.yearlyPassengers = yearlyPassengers;
    }

    /**
     * @return the yearBuilt
     */
    public String getYearBuilt() {
        return yearBuilt;
    }

    /**
     * @param yearBuilt the yearBuilt to set
     */
    public void setYearBuilt(String yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    /**
     * @return the features
     */
    public String getFeatures() {
        return features;
    }

    /**
     * @param features the features to set
     */
    public void setFeatures(String features) {
        this.features = features;
    }

    /**
     * @return the ceo
     */
    public String getCeo() {
        return ceo;
    }

    /**
     * @param ceo the ceo to set
     */
    public void setCeo(String ceo) {
        this.ceo = ceo;
    }

    /**
     * @return the airportIcon
     */
    public PImage getAirportIcon() {
        return airportIcon;
    }

    /**
     * @param airportIcon the airportIcon to set
     */
    public void setAirportIcon(PImage airportIcon) {
        this.airportIcon = airportIcon;
    }
}