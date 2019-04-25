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

    // these one will display all the "headings" before the : (eg. name: Val Verde airport, or "location" etc)
    public void airportInfoTemp(){
        ui.stroke(0);
        ui.textSize(25);
        ui.text("Name: ", 120, 780);
        ui.text("Location: ", 120, 800);
        ui.text("Yearly Passengers: ", 120, 820);
        ui.text("Year Built: ", 120, 840);
        ui.text("Features: ", 120, 860);
    }



    // 3 menu boxes linked to the airport

    // menu that shows information about the airport that was clicked
    public void airportInfo(Airports airport) {
        ui.stroke(0);
        ui.textSize(25);
        ui.text(airport.getName(), 280, 780);
        ui.text(airport.getLocation(), 280, 800);
        ui.text(airport.getYearlyPassengers(), 280, 820);
        ui.text(airport.getYearBuilt(), 280, 840);
        ui.text(airport.getFeatures(), 280, 860);
    }

    // menu that gives you an option of selecting a airplane before you generate it
    public void airplaneSelection() {

    }

    // menu that allows you to choose the pilot
    public void pilotSelection() {
        
    }

    // 3 menus linked to the airplane

    // menu that will display information about the airplane you generated
    public void airplaneInfo() {

    }

    // menu for controlling the airplane
    public void airplaneSettings(){

    }

    // menu that displays the information about the previouly chosen pilot
    public void pilotInfo(){

    }
}