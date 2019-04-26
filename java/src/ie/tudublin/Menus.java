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

    // this one will display all the "headings" before the : (eg. name: Val Verde airport, or "location" etc)
    public void airportInfoTemp(){
        ui.stroke(0);
        ui.textSize(25);
        ui.text("Name: ", 80, 925);
        ui.text("Location: ", 96, 950);
        ui.text("CEO: ", 71, 975);
        ui.text("Yearly Passengers: ", 154, 1000);
        ui.text("Year Built: ", 103, 1025);
        ui.text("Features: ", 97, 1050);
    }


    // 3 menu boxes linked to the airport

    // menu that shows information about the airport that was clicked
    public void airportInfo(Airports airport) {
        ui.stroke(0);
        ui.textSize(25);
        ui.text(airport.getName(), 280, 925);
        ui.text(airport.getLocation(), 280, 950);
        ui.text(airport.getCeo(), 280, 975);
        ui.text(airport.getYearlyPassengers(), 280, 1000);
        ui.text(airport.getYearBuilt(), 280, 1025);
        ui.text(airport.getFeatures(), 300, 1050);
    }

    // menu that gives you an option of selecting a airplane before you generate it
    public void airplaneSelection(Airplanes airplane) {
        ui.stroke(0);
        ui.textSize(25);

        ui.stroke(0);
        ui.textSize(25);
        ui.text("Model: ", 820, 780);
        ui.text("Capacity: ", 820, 800);
        ui.text("Weight: ", 820, 820);
        ui.text("No. of Previous Flights: ", 820, 840);
        ui.text("Safety Level: ", 820, 860);
        ui.text("Manufacture Year: ", 820, 880);
        ui.text("Airplane Speed: ", 820, 900);

        ui.text(airplane.getModel(), 1000, 780);
        ui.text(airplane.getCapacity(), 1000, 800);
        ui.text(airplane.getWeight(), 1000, 820);
        ui.text(airplane.getNoOfPrvFlights(), 1000, 840);
        ui.text(airplane.getSafetyLevel(), 1000, 860);
        ui.text(airplane.getManufactureYear(), 1000, 880);
        ui.text(airplane.getAirplaneSpeed(), 1000, 900);
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