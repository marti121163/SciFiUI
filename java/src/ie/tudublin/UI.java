package ie.tudublin;

import java.util.ArrayList;
import processing.core.PApplet;
import processing.core.PImage;
import processing.core.PVector;

public class UI extends PApplet
{
    // VARIABLES

    // for once something is selected
    Airports selectedAirport;
    Airplanes selectedAirplane;
    Pilots selectedPilot;
    Airplanes clickedAirplane;
    int selectedColour;

    // buttons
    Button buttonAirplane1;
    Button buttonAirplane2;
    Button buttonAirplane3;
    Button buttonAirplane4;
    Button buttonPilot1;
    Button buttonPilot2;
    BasicButton generateButton;
    BasicButton clearButton;
    BasicButton greenAirplane;
    BasicButton redAirplane;
    BasicButton blueAirplane;
    BasicButton blackAirplane;

    // images
    PImage map;
    PImage airportImg1;
    PImage airportImg2;
    PImage airportImg3;
    PImage airportImg4;
    PImage airportImg5;
    PImage airportImg6;
    PImage airplaneImg1;
    PImage airplaneImg2;
    PImage airplaneImg3;
    PImage airplaneImg4;
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

        // loads in airplane images
        airplaneImg1 = loadImage(mainPath + "\\images\\airplaneImg1.jpg");
        airplaneImg2 = loadImage(mainPath + "\\images\\airplaneImg2.jpg");
        airplaneImg3 = loadImage(mainPath + "\\images\\airplaneImg3.jpg");
        airplaneImg4 = loadImage(mainPath + "\\images\\airplaneImg4.jpg");

        // loads in pilot images
        pilotImg1 = loadImage(mainPath + "\\images\\pilot1.jpg");
        pilotImg2 = loadImage(mainPath + "\\images\\pilot2.jpg");
    
        // airport buttons setup + adding them to the array
        airport1 = new Airports(this, 430, 500, width, height, "Val Verde Airport", "Val Verde", "Austin Roberts", "25,000", "1986", "Great Service", airportImg1);
        airport2 = new Airports(this, 495, 76, width, height, "Los Santos Airport", "Los Santos", "CJ Williams", "95,000", "1956", "Amazing Food", airportImg2);
        airport3 = new Airports(this, 600, 290, width, height, "Yerba Airport", "Yerba", "Kelly Smith", "24,500", "1996", "Highly ranked", airportImg3);
        airport4 = new Airports(this, 1350, 550, width, height, "Wakanda Airport", "Wakanda", "Brie Larson", "165,800", "1986", "Technologically Advanced", airportImg4);
        airport5 = new Airports(this, 1670, 140, width, height, "Tansia Airport", "Val Verde", "Wanda Maximoff", "7,000", "2006", "Beautiful surroundings", airportImg5);
        airport6 = new Airports(this, 1600, 285, width, height, "Panau Airport", "Panau", "Mina Myoui", "116,000", "1916", "Cheap", airportImg6);
        airportList.add(airport1);
        airportList.add(airport2);
        airportList.add(airport3);
        airportList.add(airport4);
        airportList.add(airport5);
        airportList.add(airport6);


        // airplane buttons setup + adding them to the array
        airplane1 = new Airplanes(this, "KIA728", "50", "30t", "28", "medium", "1998", 20, airplaneImg1);
        airplane2 = new Airplanes(this, "MIB318", "130", "50t", "61", "low", "1989", 20, airplaneImg2);
        airplane3 = new Airplanes(this, "BDE178", "250", "70t", "15", "high", "2007", 20, airplaneImg3);
        airplane4 = new Airplanes(this, "JET042", "25", "10t", "5", "medium", "2012", 20, airplaneImg4);
        airplaneList.add(airplane1);
        airplaneList.add(airplane2);
        airplaneList.add(airplane3);
        airplaneList.add(airplane4);

        // pilot buttons setup + adding them to the array
        pilot1 = new Pilots("Carol Danvers", "Female", "12-06-1975", "Boston, MA, USA", "Captain", pilotImg1);
        pilot2 = new Pilots("Steve Rogers", "Male", "13-03-1958", "Brooklyn, NY, USA", "Captain", pilotImg2);
        pilotList.add(pilot1);
        pilotList.add(pilot2);

        // action buttons
        generateButton = new BasicButton(this, 760, 600, 150, 50, "GENERATE");
        clearButton = new BasicButton(this, 960, 600, 150, 50, "CLEAR");

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
        
        // setting up buttons for changing colours
        int colourY = 950;
        int colourX = 655;
        int colourButtonGap = 150;
        redAirplane = new BasicButton(this, colourX, colourY, airplaneButtonW, airplaneButtonH, "Red");
        blueAirplane = new BasicButton(this, colourX + colourButtonGap, colourY, airplaneButtonW, airplaneButtonH, "Blue");
        greenAirplane = new BasicButton(this, colourX + colourButtonGap*2, colourY, airplaneButtonW, airplaneButtonH, "Green");
        blackAirplane = new BasicButton(this, colourX + colourButtonGap*3, colourY, airplaneButtonW, airplaneButtonH, "Black");

    }

    // this renders the menu that takes up lower part of the screen
    public void renderMenu() {

        if (selectedAirport == null && clickedAirplane == null && selectedPilot == null) {
            textSize(50);
            text("WELCOME!", 955, 780);
            text("CLICK ON AN AIRPORT TO BEGIN", 970, 930);
        } else if (selectedAirport != null && clickedAirplane == null) {
            // renders outline
            menuBox.render();

            radar.update();
            radar.render();

            // headings
            // airport info heading is in menus
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

            // same as above but for pilot button
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
            menuBox.airplaneInfo(clickedAirplane);
            menuBox.airplaneSettings();
            menuBox.pilotInfo(clickedAirplane);
        
            //buttons for changing colour of the airplane
            fill(255, 0, 0);
            redAirplane.render();
            fill(0, 0, 255);
            blueAirplane.render();
            fill(0, 255, 0);
            greenAirplane.render();
            fill(255);
            blackAirplane.render();
        }
    }

    // this renders a drawn airplane
    public void renderAirplanes() {
        for (int i = 0; i < readyAirplanes.size(); i++) {
            Airplanes airplane = readyAirplanes.get(i);
            airplane.draw();
        }
    }

    // this is for the message that spans at the top
    private PVector messagePos = new PVector(-500,20);
    public void movingMessage() {

        fill(255);
        //textAlign(LEFT);
        if (messagePos.x > 1916) {
            messagePos.x = -500;
        }
        messagePos.x = (messagePos.x + 4);
        text("FLIGHT TRACKER SIMULATOR", messagePos.x, messagePos.y);
    }

    public void draw()
    {
        background(0);

        image(map, 0, 0);

        textSize(30);
        //renders the moving messages displayed on top of the screen
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

        // function for clicking on a button and changing a colour of all airplanes
        int colourX = 655;
        int colourY = 950;
        int colourButtonGap = 150;
        if(mouseX > colourX  && mouseX < (colourX + 150) && mouseY > colourY && mouseY < (colourY + 50)){
            selectedColour = 1;
        } else if (mouseX > (colourX + colourButtonGap) && mouseX < ((colourX + colourButtonGap) + 150) && mouseY > colourY && mouseY < (colourY + 50)){
            selectedColour = 2;
        } else if (mouseX > (colourX + colourButtonGap*2) && mouseX < ((colourX + colourButtonGap*2) + 150) && mouseY > colourY & mouseY < (colourY + 50)){
            selectedColour = 3;
        } else if (mouseX > (colourX + colourButtonGap*3) && mouseX < ((colourX + colourButtonGap*3) + 150) && mouseY > colourY && mouseY < (colourY + 50)){
            selectedColour = 4;
        }

        // calls the function that generates the airplane once the "generate" button is clicked
        if(mouseX > 760 && mouseX < (760 + 150) && mouseY > 600 && mouseY < (600 + 50)){
            // generateAirplane();
            selectedAirplane.setVariables(selectedAirport, 10, 35, selectedPilot);
            readyAirplanes.add(selectedAirplane);
            selectedAirport = null;
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
}

