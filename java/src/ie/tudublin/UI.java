package ie.tudublin;

import java.util.ArrayList;

//import javafx.scene.control.Menu;
import processing.core.PApplet;
import processing.core.PImage;
import sun.java2d.pipe.ValidatePipe;

public class UI extends PApplet
{
    Airports selectedAirport;
    Airplanes selectedAirplane;
    Pilots selectedPilot;

    // buttons
    Button buttonAirplane1;
    Button buttonAirplane2;
    Button buttonAirplane3;
    Button buttonAirplane4;

    Button buttonPilot1;
    Button buttonPilot2;
    Plane plane1;

    BasicButton generateButton;

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

    // planes
    Pilots pilot1;
    Pilots pilot2;
    Pilots pilot3;

    Menus menuBox;

    Radar radar;

    public int airplaneButtonAmount = 4;
    public int pilotButtonAmount = 2;

    boolean[] keys = new boolean[1024];

    private ArrayList<AirplaneButton> airplaneButtons = new ArrayList<AirplaneButton>();
    private ArrayList<Airplanes> airplaneList = new ArrayList<Airplanes>();

    private ArrayList<PilotButton> pilotButtons = new ArrayList<PilotButton>();
    private ArrayList<Pilots> pilotList = new ArrayList<Pilots>();

    public void keyPressed()
    {
        keys[keyCode] = true;
    }
    
    public void keyReleased()
    {
        keys[keyCode] = false;
    }

    public boolean checkKey(int c)
    {
        return keys[c] || keys [Character.toUpperCase(c)];
    }
    

    public void settings()
    {
        //size(1920, 1080);
        // Use fullscreen instead of size to make your interface fullscreen
        fullScreen(); 
    }

    public void setup()
    {
        // this loads in my premade map
        String mainPath = "C:\\Users\\marty\\Desktop\\Projects\\OOP Assignment\\SciFiUI";

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
        airplaneImg1 = loadImage(mainPath + "\\images\\airlane1.jpg");
        airplaneImg2 = loadImage(mainPath + "\\images\\airplane2.jpg");
        airplaneImg3 = loadImage(mainPath + "\\images\\airplane3.jpg");
        airplaneImg4 = loadImage(mainPath + "\\images\\airplane4.jpg");

        // loads in pilot images
        pilotImg1 = loadImage(mainPath + "\\images\\pilot1.jpg");
        pilotImg2 = loadImage(mainPath + "\\images\\pilot2.jpg");

    
        // airport buttons setup
        airport1 = new Airports(this, 430, 500, width, height, "Val Verde Airport", "Val Verde", "Austin Roberts", "25,000", "1986", "Something Fancy", airportImg1);
        airport2 = new Airports(this, 495, 76, width, height, "Los Santos Airport", "Los Santos", "CJ Williams", "95,000", "1956", "Something Fancy 2", airportImg2);
        airport3 = new Airports(this, 600, 290, width, height, "Yerba Airport", "Yerba", "Kelly Smith", "24,500", "1996", "Something Fancy 3", airportImg3);
        airport4 = new Airports(this, 1350, 550, width, height, "Wakanda Airport", "Wakanda", "Brie Larson", "165,800", "1986", "Something Fancy 4", airportImg4);
        airport5 = new Airports(this, 1670, 140, width, height, "Tansia Airport", "Val Verde", "Wanda Maximoff", "7,000", "2006", "Something Fancy 5", airportImg5);
        airport6 = new Airports(this, 1600, 285, width, height, "Panau Airport", "Panau", "Mina Myoui", "116,000", "1916", "Something Fancy 6", airportImg6);


        // airplanes
        airplane1 = new Airplanes("KIA728", "50", "30t", "28", "medium", "1998", "18/20", airplaneImg1);
        airplane2 = new Airplanes("MIB318", "130", "50t", "61", "low", "1989", "12/20", airplaneImg2);
        airplane3 = new Airplanes("BDE178", "250", "70t", "15", "high", "2007", "16/20", airplaneImg3);
        airplane4 = new Airplanes("JET042", "25", "10t", "5", "medium", "2012", "10/20", airplaneImg4);
        airplaneList.add(airplane1);
        airplaneList.add(airplane2);
        airplaneList.add(airplane3);
        airplaneList.add(airplane4);

        // pilots
        pilot1 = new Pilots("Carol Danvers", "Female", "12-06-1975", "Boston, MA, USA", "reseach ranks", pilotImg1);
        pilot2 = new Pilots("Steve Rogers", "Male", "13-03-1958", "Brooklyn, NY, USA", "reseach ranks", pilotImg2);
        pilotList.add(pilot1);
        pilotList.add(pilot2);

    

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

        // action buttons
        generateButton = new BasicButton(this, 0, 0, 150, 50, "GENERATE");

        plane1 = new Plane(this, width / 2, height * .75f, 50);
        radar = new Radar(this, 500, 500, 810, 60);

    }

    public void renderMenu() {
        //menuBox.render();
        // renders outline
        if (selectedAirport != null) {
            menuBox.render();

            radar.update();
            radar.render();

            text("AIRPORT INFO", 280, 705);
            text("AIRPLANE SELECTION", 960, 705);
            text("PILOT SELECTION", 1645, 705);

            menuBox.airportInfo(selectedAirport);

            //airplane selection buttons
            for (int i = 0; i < airplaneButtons.size(); i++) {
                AirplaneButton button = airplaneButtons.get(i);
                button.render();
            }

             //pilot selection buttons
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


            if (selectedAirplane != null && selectedPilot != null){
                generateButton.render();

            }
        }
    }


    public void draw()
    {
        background(0);

        image(map, 0, 0);

        stroke(0);
        fill(102, 204, 204);
        rect(735, 5, 475, 38);
        fill(27, 20, 119);
        textSize(30);
        text("FLIGHT TRACKER SIMULATOR", 975, 20);

        // airports
        airport1.render();
        airport2.render();
        airport3.render();    
        airport4.render();
        airport5.render();
        airport6.render();

        renderMenu();
        
    }

    // fuction for displaying a menu for each airport, 30 is height and 145 is the width
    // i tried not hard coding it and it messed everything up so i decided to leave it this way
    public void mouseClicked() {
        System.out.println("start");
        if (mouseX > 430 && mouseX < (430 + 145) && mouseY > 500 && mouseY < (500 + 30)) {
            selectedAirport = airport1;
        } else if (mouseX > 495 && mouseX < (495 + 145) && mouseY > 75 && mouseY < (75 + 30)) {
            selectedAirport = airport2;
        } else if (mouseX > 600 && mouseX < (600 + 145) && mouseY > 290 && mouseY < (290 + 30)) {
            selectedAirport = airport3;
        } else if (mouseX > 1350 && mouseX < (1350 + 145) && mouseY > 550 && mouseY < (550 + 30)) {
            selectedAirport = airport4;
        } else if (mouseX > 1670 && mouseX < (1670 + 145) && mouseY > 140 && mouseY < (140 + 30)) {
            selectedAirport = airport5;
        } else if (mouseX > 1600 && mouseX < (1600 + 145) && mouseY > 285 && mouseY < (285 + 30)) {
            selectedAirport = airport6;
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

        if(mouseX > 0 && mouseX < (0 + 150) && mouseY > 0 && mouseY < (0 + 50)){
            generateAirplane();
        }
            //set selectedAirplane = null && selectedPilot = null;
        //}

        // for loop
        // when you click on an airplane
        // function for airplane

    } // mouseClicked end

    // function for changing the colour of the airport box when you hover onto it
    boolean overRect(int x, int y, int width, int height)  {
        if (mouseX >= x && mouseX <= x + width && mouseY >= y && mouseY <= y + height) {
          return true;
        } else {
          return false;
        }
    }

    public void generateAirplane(){
        // draw the airplane
        // place above the right airport

        //plane1.update();
        plane1.draw();
        
    }

    // function that's gonna get called in mouseClicked
    // pull airplane info from selectedAirplane
    // call settings menu
    // pull pilot info from selectedPIlot

}

