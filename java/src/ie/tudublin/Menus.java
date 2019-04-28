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

    // 3 menu boxes linked to clicking the airport

    // menu that shows information about the airport that was clicked
    public void airportInfo(Airports airport) {
        ui.stroke(0);
        ui.textSize(25);

        ui.text("Name: ", 80, 925);
        ui.text("Location: ", 96, 950);
        ui.text("CEO: ", 71, 975);
        ui.text("Yearly Passengers: ", 154, 1000);
        ui.text("Year Built: ", 103, 1025);
        ui.text("Features: ", 97, 1050);

        ui.text(airport.getName(), 400, 925);
        ui.text(airport.getLocation(), 400, 950);
        ui.text(airport.getCeo(), 400, 975);
        ui.text(airport.getYearlyPassengers(), 400, 1000);
        ui.text(airport.getYearBuilt(), 400, 1025);
        ui.text(airport.getFeatures(), 400, 1050);
        ui.image(airport.getAirportIcon(), 40, 745);
    }

    // menu that gives you an option of selecting a airplane before you generate it
    public void airplaneSelection(Airplanes airplane) {
        ui.stroke(0);
        ui.textSize(25);
        ui.text("Model: ", 690, 770);
        ui.text("Capacity: ", 704, 800);
        ui.text("Weight: ", 695, 830);
        ui.text("No. of Previous Flights: ", 790, 860);
        ui.text("Safety Level: ", 725, 890);
        ui.text("Manufacture Year: ", 760, 920);
        ui.text("Airplane Speed: ", 745, 950);

        ui.text(airplane.getModel(), 1000, 770);
        ui.text(airplane.getCapacity(), 1000, 800);
        ui.text(airplane.getWeight(), 1000, 830);
        ui.text(airplane.getNoOfPrvFlights(), 1000, 860);
        ui.text(airplane.getSafetyLevel(), 1000, 890);
        ui.text(airplane.getManufactureYear(), 1000, 920);
        ui.text(airplane.getAirplaneSpeed(), 1000, 950);
        ui.image(airplane.getAirplaneIcon(), 1100, 800);
    }

    // menu that allows you to choose the pilot
    public void pilotSelection(Pilots pilot) {
        ui.stroke(0);
        ui.textSize(25);

        ui.text("Name : ", 1498, 780);
        ui.text("Gender: ", 1498, 890);
        ui.text("DOB: ", 1481, 920);
        ui.text("Place of birth: ", 1535, 950);
        ui.text("Rank: ", 1485, 980);

        ui.text(pilot.getPilotName(), 1660, 780);
        ui.text(pilot.getGender(), 1750, 890);
        ui.text(pilot.getDob(), 1750, 920);
        ui.text(pilot.getPlaceofBirth(), 1745, 950);
        ui.text(pilot.getRank(), 1750, 980);
        ui.image(pilot.getPilotIcon(), 1780, 745);

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

    public boolean airplaneHover(int mouseX, int mouseY, AirplaneButton airplaneButton){
        if (ui.overRect((int) airplaneButton.getX(), (int) airplaneButton.getY(), (int) airplaneButton.getWidth(), (int) airplaneButton.getHeight())) {
            airplaneSelection(airplaneButton.getAirplane());
            return true;
        } 
        return false;
    }

    public boolean pilotHover(int mouseX, int mouseY, PilotButton pilotButton){
        if (ui.overRect((int) pilotButton.getX(), (int) pilotButton.getY(), (int) pilotButton.getWidth(), (int) pilotButton.getHeight())) {
            pilotSelection(pilotButton.getPilot());
            return true;
        } 
        return false;
    }
}

