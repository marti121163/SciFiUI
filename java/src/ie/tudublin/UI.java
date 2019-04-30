package ie.tudublin;

import java.util.ArrayList;

//import javafx.scene.control.Menu;
import processing.core.PApplet;
import processing.core.PImage;
// import sun.java2d.pipe.ValidatePipe;
import processing.core.PVector;

public class UI extends PApplet
{
    // VARIABLES

    Airports selectedAirport;
    Airplanes selectedAirplane;
    Pilots selectedPilot;
    Airplanes clickedAirplane;

    // buttons
    Button buttonAirplane1;
    Button buttonAirplane2;
    Button buttonAirplane3;
    Button buttonAirplane4;
    Button buttonPilot1;
    Button buttonPilot2;
    BasicButton generateButton;
    BasicButton clearButton;

    // images
    PImage map;
    PImage airportImg1;
    PImage airportImg2;
    PImage airportImg3;
    PImage airportImg4;
    PImage airportImg5;
    PImage airportImg6;
    // PImage airplaneImg1;
    // PImage airplaneImg2;
    // PImage airplaneImg3;
    // PImage airplaneImg4;
    PImage pilotImg1;
    PImage pilotImg2;

    // airports
    Airports airport1;
    Airports airport2;
    Airports airport3;
    Airports airport4;
    Airports airport5;
    Airports airport6;

    // airplanes
    Airplanes airplane1;
    Airplanes airplane2;
    Airplanes airplane3;
    Airplanes airplane4;

    // pilots
    Pilots pilot1;
    Pilots pilot2;
    Pilots pilot3;

    Menus menuBox;

    Radar radar;

    public int airplaneButtonAmount = 4;
    public int pilotButtonAmount = 2;

    // Arrays
    private ArrayList<Airports> airportList = new ArrayList<Airports>();

    private ArrayList<AirplaneButton> airplaneButtons = new ArrayList<AirplaneButton>();
    private ArrayList<Airplanes> airplaneList = new ArrayList<Airplanes>();
    private ArrayList<Airplanes> readyAirplanes = new ArrayList<Airplanes>();

    private ArrayList<PilotButton> pilotButtons = new ArrayList<PilotButton>();
    private ArrayList<Pilots> pilotList = new ArrayList<Pilots>();

    public void settings()
    {
        fullScreen(); 
    }

    public void setup()
    {
        String mainPath = "C:\\Users\\marty\\Desktop\\Projects\\OOP Assignment\\SciFiUI";

        // this loads in my premade map
        map = loadImage(mainPath + "\\images\\map.png");

        // menu box outline
        menuBox = new Menus(this, 3, 686, 1916, 393, 30, 40);

        // loads in airport images
        airportImg1 = loadImage(mainPath + "\\images\\airportImg1.png");
        airportImg2 = loadImage(mainPath + "\\images\\airportImg2.png");
        airportImg3 = loadImage(mainPath + "\\images\\airportImg3.png");
        airportImg4 = loadImage(mainPath + "\\images\\airportImg4.png");
        airportImg5 = loadImage(mainPath + "\\images\\airportImg5.png");
        airportImg6 = loadImage(mainPath + "\\images\\airportImg6.png");

        // // loads in airplane images
        // airplaneImg1 = loadImage(mainPath + "\\images\\airlane1.jpg");
        // airplaneImg2 = loadImage(mainPath + "\\images\\airplane2.jpg");
        // airplaneImg3 = loadImage(mainPath + "\\images\\airplane3.jpg");
        // airplaneImg4 = loadImage(mainPath + "\\images\\airplane4.jpg");

        // loads in pilot images
        pilotImg1 = loadImage(mainPath + "\\images\\pilot1.jpg");
        pilotImg2 = loadImage(mainPath + "\\images\\pilot2.jpg");
    
        // airport buttons setup + adding them to the array
        airport1 = new Airports(this, 430, 500, width, height, "Val Verde Airport", "Val Verde", "Austin Roberts", "25,000", "1986", "Something Fancy", airportImg1);
        airport2 = new Airports(this, 495, 76, width, height, "Los Santos Airport", "Los Santos", "CJ Williams", "95,000", "1956", "Something Fancy 2", airportImg2);
        airport3 = new Airports(this, 600, 290, width, height, "Yerba Airport", "Yerba", "Kelly Smith", "24,500", "1996", "Something Fancy 3", airportImg3);
        airport4 = new Airports(this, 1350, 550, width, height, "Wakanda Airport", "Wakanda", "Brie Larson", "165,800", "1986", "Something Fancy 4", airportImg4);
        airport5 = new Airports(this, 1670, 140, width, height, "Tansia Airport", "Val Verde", "Wanda Maximoff", "7,000", "2006", "Something Fancy 5", airportImg5);
        airport6 = new Airports(this, 1600, 285, width, height, "Panau Airport", "Panau", "Mina Myoui", "116,000", "1916", "Something Fancy 6", airportImg6);
        airportList.add(airport1);
        airportList.add(airport2);
        airportList.add(airport3);
        airportList.add(airport4);
        airportList.add(airport5);
        airportList.add(airport6);


        // airplane buttons setup + adding them to the array
        airplane1 = new Airplanes(this, "KIA728", "50", "30t", "28", "medium", "1998", 20);
        airplane2 = new Airplanes(this, "MIB318", "130", "50t", "61", "low", "1989", 20);
        airplane3 = new Airplanes(this, "BDE178", "250", "70t", "15", "high", "2007", 20);
        airplane4 = new Airplanes(this, "JET042", "25", "10t", "5", "medium", "2012", 20);
        airplaneList.add(airplane1);
        airplaneList.add(airplane2);
        airplaneList.add(airplane3);
        airplaneList.add(airplane4);

        // pilot buttons setup + adding them to the array
        pilot1 = new Pilots("Carol Danvers", "Female", "12-06-1975", "Boston, MA, USA", "reseach ranks", pilotImg1);
        pilot2 = new Pilots("Steve Rogers", "Male", "13-03-1958", "Brooklyn, NY, USA", "reseach ranks", pilotImg2);
        pilotList.add(pilot1);
        pilotList.add(pilot2);

        // action buttons
        generateButton = new BasicButton(this, 760, 600, 150, 50, "GENERATE");
        clearButton = new BasicButton(this, 960, 600, 150, 50, "CLEAR");

        //plane1 = new Plane(this, width / 2, height * .75f);
        radar = new Radar(this, 500, 500, 810, 60);

    
        // for loop for airplane buttons
        int airplaneButtonGap = 170;
        int startingAirplaneButtonX = 625;
        int airplaneButtonY = 1010;
        int airplaneButtonH = 50;
        int airplaneButtonW = 150;
        for (int i = 0; i < airplaneButtonAmount; i++) {
            String airplaneName = "Airplane " + (i + 1);
            AirplaneButton airplaneButton = new AirplaneButton(this, startingAirplaneButtonX + i * airplaneButtonGap, airplaneButtonY, airplaneButtonW, airplaneButtonH, airplaneName, airplaneList.get(i));
            airplaneButtons.add(airplaneButton);
        }


        // for loop for pilot buttons
        int pilotButtonGap = 160;
        int startingPilotButtonX = 1480;
        int pilotButtonY = 1010;
        int pilotButtonH = 50;
        int pilotButtonW = 150;
        for (int i = 0; i < pilotButtonAmount; i++) {
            String pilotName = "Pilot " + (i + 1);
            PilotButton pilotButton = new PilotButton(this, startingPilotButtonX + i * pilotButtonGap, pilotButtonY, pilotButtonW, pilotButtonH, pilotName, pilotList.get(i));
            pilotButtons.add(pilotButton);
        }

    }

    // this renders the menu that takes up lower part of the screen
    public void renderMenu() {
        if (selectedAirport != null && clickedAirplane == null) {
            // renders outline
            menuBox.render();

            radar.update();
            radar.render();

            // headings
            text("AIRPORT INFO", 280, 705);
            text("AIRPLANE SELECTION", 960, 705);
            text("PILOT SELECTION", 1645, 705);

            // if you have selected an airport it will display it
            menuBox.airportInfo(selectedAirport);

            //rendering airplane selection buttons
            for (int i = 0; i < airplaneButtons.size(); i++) {
                AirplaneButton button = airplaneButtons.get(i);
                button.render();
            }

            //rendering pilot selection buttons
            for (int i = 0; i < pilotButtons.size(); i++) {
                PilotButton button = pilotButtons.get(i);
                button.render();
            }

            // Checks if airplane button is hovered over then display info about it
            // else if its not hovered over and an airplane button has been clicked then 
            // display the info on that
            boolean hoveredOverAirplane = false;
            for(int i = 0; i < airplaneButtons.size(); i++){
                
                boolean hoveredOverAirplane2 = menuBox.airplaneHover(mouseX, mouseY, airplaneButtons.get(i));
                if (hoveredOverAirplane2 == true) {
                    hoveredOverAirplane = true;
                    break;
                }
            }
            if (hoveredOverAirplane == false && selectedAirplane != null) {
                menuBox.airplaneSelection(selectedAirplane);
            }

            // same as above but for pilot
            boolean hoveredOverPilot = false;
            for(int i = 0; i < pilotButtons.size(); i++){
                
                boolean hoveredOverPilot2 = menuBox.pilotHover(mouseX, mouseY, pilotButtons.get(i));
                if (hoveredOverPilot2 == true) {
                    hoveredOverPilot = true;
                    break;
                }
            }
            if (hoveredOverPilot == false && selectedPilot != null) {
                menuBox.pilotSelection(selectedPilot);
            }

            // if both a pilot and a airplane are selected a "generate" and "clear" buttons will show up
            if (selectedAirplane != null && selectedPilot != null){
                fill(255, 0, 0);
                generateButton.render();
                clearButton.render();
            } 
        } else if (clickedAirplane != null){
            menuBox.render();
            menuBox.airplaneSettings();
            menuBox.pilotInfo(clickedAirplane);
            fill(255);
            noStroke();
            fill(200, 0, 0);
            text("Please Click on the Destination Airport", 950, 800);

        }
    }

    // this renders a drawn airplane
    public void renderAirplanes() {
        for (int i = 0; i < readyAirplanes.size(); i++) {
            Airplanes airplane = readyAirplanes.get(i);
            airplane.draw();
        }
    }

    private PVector messagePos = new PVector(-300,20);
    public void movingMessage() {

        fill(255);
        textAlign(LEFT);
        if (messagePos.x > 1916) {
            messagePos.x = -300;
        }
        messagePos.x = (messagePos.x + 5);
        text("FLIGHT TRACKER SIMULATOR", messagePos.x, messagePos.y);
    }

    // public float timeDelta;
    // private float last;
    public void draw()
    {
        background(0);

        image(map, 0, 0);

        stroke(0);
        fill(102, 204, 204);
        rect(735, 5, 475, 38);
        fill(27, 20, 119);
        textSize(30);
        movingMessage();

        // airports
        airport1.render();
        airport2.render();
        airport3.render();    
        airport4.render();
        airport5.render();
        airport6.render();

        // renders the menu once an an airport or an airplane is clicked
        renderMenu();
        // renders the airplanes that are currently in flight
        renderAirplanes();
    }

    // fuction for displaying a menu for each airport
    public void mouseClicked() {
        boolean reselectClickedAirplane = false;

        // function for when you click on an airplane you select it and it gets displayed
        for(int i = 0; i < airportList.size(); i++){
            Airports airport = airportList.get(i);
            if (overRect((int)airport.getX(), (int)airport.getY(), (int) airport.getWidth(), (int) airport.getHeight())) {
                if (clickedAirplane == null) {
                    selectedAirport = airport;
                } else {
                    clickedAirplane.setDestinationAirport(airport);
                    reselectClickedAirplane = true;
                }
                break;
            }
        }

        // funtion for when you click on an airplane you select it
        for(int i = 0; i < airplaneButtons.size(); i++){
            AirplaneButton airplaneButton = airplaneButtons.get(i);
            if (overRect((int) airplaneButton.getX(), (int) airplaneButton.getY(), (int) airplaneButton.getWidth(), (int) airplaneButton.getHeight())) {
                selectedAirplane = airplaneButton.getAirplane();
                break;
            }
        }

        // funtion for when you click on an pilot you select it
        for(int i = 0; i < pilotButtons.size(); i++){
            PilotButton pilotButton = pilotButtons.get(i);
            if (overRect((int) pilotButton.getX(), (int) pilotButton.getY(), (int) pilotButton.getWidth(), (int) pilotButton.getHeight())) {
                selectedPilot = pilotButton.getPilot();
                break;
            }
        }

        // calls the function that generates the airplane once the "generate" button is clicked
        if(mouseX > 760 && mouseX < (760 + 150) && mouseY > 600 && mouseY < (600 + 50)){
            // generateAirplane();
            selectedAirplane.setVariables(selectedAirport, 10, 35, selectedPilot);
            readyAirplanes.add(selectedAirplane);
            selectedAirport = null;
            System.out.println("generated!");
        }

        // clears the screen
        if(mouseX > 960 && mouseX < (960 + 150) && mouseY > 600 && mouseY < (600 + 50)){
            selectedAirport = null;
        }

        // checks if airplane has been clicked
        boolean ifClickedAirplane = false; 
        for (int i = 0; i < readyAirplanes.size(); i++) {
            Airplanes airplane = readyAirplanes.get(i);
            int length = (int)airplane.getLength();

            if (overRect((int)airplane.getPos().x - length/2, (int)airplane.getPos().y - length/2, length, length)) {
                clickedAirplane = airplane;
                ifClickedAirplane = true;
            }
        }

        // if an airplane hasnt been clicked than its false
        if (ifClickedAirplane == false && reselectClickedAirplane == false) {
            clickedAirplane = null;
        }

    } // mouseClicked end
    
    // deletes the airplane after it has reached its destination and also removes it from the Array
    public void removePlane(Airplanes airplane) {
        readyAirplanes.remove(airplane);

        if (clickedAirplane == airplane) {
            clickedAirplane = null;
        }
    }

    // function for changing the colour of the airport box when you hover onto it
    boolean overRect(int x, int y, int width, int height)  {
        if (mouseX >= x && mouseX <= x + width && mouseY >= y && mouseY <= y + height) {
          return true;
        } else {
          return false;
        }
    }

    // public void generateAirplane(){
    //     selectedAirplane.setStartingAirport(selectedAirport);
    // }
}

