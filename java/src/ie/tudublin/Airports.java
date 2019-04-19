package ie.tudublin;

import processing.core.PApplet;

public class Airports
{
    UI ui;
    private float x;
    private float y;
    private float width;
    private float height;
    // Actual airport details listed below
    private String name;
    private String location;
    private String yearlyPassengers;
    private String yearBuilt;
    private String features;

    public Airports(UI ui, float x, float y, float width, float height, String name, String location, 
    String yearlyPassengers, String yearBuilt, String features)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.width = width = 145;
        this.height = height = 30;
        this.name = name;
        this.location = location;
        this.yearlyPassengers = yearlyPassengers;
        this.yearBuilt = yearBuilt;
        this.features = features;
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
}