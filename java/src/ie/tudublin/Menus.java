package ie.tudublin;

import java.util.ArrayList;

public class Menus
{
    UI ui;
    private float x;
    private float y;
    private float width;
    private float height;
    private float smallBoxSize;
    private float bigBoxSize;

    

    public Menus(UI ui, float x, float y, float width, float height, float smallBoxSize, float bigBoxSize)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.smallBoxSize = smallBoxSize;
        this.bigBoxSize = bigBoxSize;
    }

    public void render()
    {
        ui.noFill();
        ui.stroke(255);
        ui.rect(x, y, width, height);
        ui.fill(255);
        ui.textSize(30);
        ui.line(5, 730, 1920, 730);
        
        ui.noFill();
        // small left box
        ui.rect(x, y, width*(smallBoxSize/100), height);
        // big middle box
        ui.rect(x + width*(smallBoxSize/100), y, width*(bigBoxSize/100), height);
    }


    // MENUS

    // 3 menu boxes linked to the airport
    public void airportInfo(Airports airport) {
        ui.stroke(0);
        ui.textSize(25);
        ui.text(airport.getName(), 120, 780);
        ui.text(airport.getLocation(), 120, 800);
        ui.text(airport.getYearlyPassengers(), 120, 820);
        ui.text(airport.getYearBuilt(), 120, 840);
        ui.text(airport.getFeatures(), 120, 860);
        //ui.text(, x, y);
    }

    public void airplaneSelection() {

    }

    public void pilotSelection() {

    }

    // 3 menus linked to the airplane

    public void airplaneInfo() {

    }

    public void airplaneSettings(){

    }

    public void pilotInfo(){

    }
}