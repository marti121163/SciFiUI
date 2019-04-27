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
    //Plane plane1;

    // images
    PImage map;
    PImage airportImg1;
    PImage airportImg2;
    PImage airportImg3;
    PImage airportImg4;
    PImage airportImg5;
    PImage airportImg6;
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

    public int airplaneButtonAmount = 4;

    boolean[] keys = new boolean[1024];

    private ArrayList<Button> airplaneButtons = new ArrayList<Button>();

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
        map = loadImage("C:\\Users\\marty\\Desktop\\Projects\\OOP Assignment\\SciFiUI\\images\\map.png");

        String mainPath = "C:\\Users\\marty\\Desktop\\Projects\\OOP Assignment\\SciFiUI";

        // loads in airport images
        airportImg1 = loadImage(mainPath + "\\images\\airportImg1.png");
        airportImg2 = loadImage(mainPath + "\\images\\airportImg2.png");
        airportImg3 = loadImage(mainPath + "\\images\\airportImg3.png");
        airportImg4 = loadImage(mainPath + "\\images\\airportImg4.png");
        airportImg5 = loadImage(mainPath + "\\images\\airportImg5.png");
        airportImg6 = loadImage(mainPath + "\\images\\airportImg6.png");

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

        // menu box outline
        menuBox = new Menus(this, 3, 686, 1916, 393, 30, 40);

        // airplanes
        airplane1 = new Airplanes("KIA728", "50", "30t", "28", "medium", "1998", "18/20");
        airplane2 = new Airplanes("MIB318", "130", "50t", "61", "low", "1989", "12/20");
        airplane3 = new Airplanes("BDE178", "250", "70t", "15", "high", "2007", "16/20");
        airplane4 = new Airplanes("JET042", "25", "10t", "5", "medium", "2012", "10/20");


        // pilots
        pilot1 = new Pilots("Carol Danvers", "Female", "12-06-1975", "Boston, MA, USA", "reseach ranks");
        pilot2 = new Pilots("Steve Rogers", "Male", "13-03-1958", "Brooklyn, NY, USA", "reseach ranks");

    

        int airplaneButtonGap = 170;
        int startingAirplaneButtonX = 625;
        int airplaneButtonY = 1010;
        int airplaneButtonH = 50;
        int airplaneButtonW = 150;
        for (int i = 0; i < airplaneButtonAmount; i++) {
            String airplaneName = "Airport " + (i + 1);
            Button airplaneButton = new AirplaneButton(this, startingAirplaneButtonX + i * airplaneButtonGap, airplaneButtonY, airplaneButtonW, airplaneButtonH, airplaneName);
            airplaneButtons.add(airplaneButton);
        }

        // buttons for pilot seleciton
        buttonPilot1 = new PilotButton(this, 1480, 1010, 150, 50, "Pilot 1");
        buttonPilot2 = new PilotButton(this, 1640, 1010, 150, 50, "Pilot 2");

        //plane1 = new Plane(this, width / 2, height * .75f, 50);
        radar = new Radar(this, 500, 500, 810, 60);

    }

    public void renderMenu() {
        //menuBox.render();
        // renders outline
        if (selectedAirport != null) {
            menuBox.render();
            //menuBox.airportInfoTemp();
            menuBox.airportInfo(selectedAirport);

            //airplane selection buttons
            for (int i = 0; i < airplaneButtons.size(); i++) {
                Button button = airplaneButtons.get(i);
                button.render();
            }
              

            buttonPilot1.render();
            buttonPilot2.render();

            radar.update();
            radar.render();

            // this shows the airport images when you click on them
            // if (selectedAirport == airport1) {
            //     image(airportImg1, 40, 745);
            // } else if (selectedAirport == airport2) {
            //     image(airportImg2, 40, 745);
            // } else if (selectedAirport == airport3) {
            //     image(airportImg3, 40, 745);
            // } else if (selectedAirport == airport4) {
            //     image(airportImg4, 40, 745);
            // } else if (selectedAirport == airport5) {
            //     image(airportImg5, 40, 745);
            // } else if (selectedAirport == airport6) {
            //     image(airportImg6, 40, 745);
            // }

            // // this lets you hover over different airplanes and decide on which one you want to use
            // if (mouseX > 625 && mouseX < (625 + 150) && mouseY > 1010 && mouseY < (1010 + 50)) {
            //     menuBox.airplaneSelection(airplane1);
            // } else if (mouseX > 795 && mouseX < (1010 + 150) && mouseY > 1010 && mouseY < (1010 + 50)) {
            //     menuBox.airplaneSelection(airplane2);
            // } else if (mouseX > 965 && mouseX < (965 + 150) && mouseY > 1010 && mouseY < (1010 + 50)) {
            //     menuBox.airplaneSelection(airplane3);
            // } else if (mouseX > 1135 && mouseX < (1135 + 150) && mouseY > 1010 && mouseY < (1010 + 50)) {
            //     menuBox.airplaneSelection(airplane4);
            // } else if (selectedAirplane != null) {
            //     menuBox.airplaneSelection(selectedAirplane);
            // } 

            for(int i = 0; i < airplaneButtons.size(); i++){
                menuBox.airplaneHover(mouseX, mouseY, airplaneButtons.get(i));
            }

            // same as above but for pilot selection
            if (mouseX > 1480 && mouseX < (1480 + 150) && mouseY > 1010 && mouseY < (1010 + 50)) {
                menuBox.pilotSelection(pilot1);
            } else if (mouseX > 1640 && mouseX < (1640 + 150) && mouseY > 1010 && mouseY < (1010 + 50)) {
                menuBox.pilotSelection(pilot2);
            }

            if (selectedPilot == pilot1) {
                image(pilotImg1, 1500, 780);
            } else if (selectedPilot == pilot2) {
                image(pilotImg2, 1500, 800);
            }

            // this lets you hover over different airplanes and decide on which one you want to use

            // if (selectedAirplane != null && selectedPilot != null){

            // }

        }
    }

    Radar radar;

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

        //plane1.update();
        //plane1.render();

        //radar.update();
        //radar.render();

        if (checkKey(LEFT))
        {
            System.out.println("Left arrow key pressed");
        }

        if (checkKey(RIGHT))
        {
            System.out.println("Right arrow key pressed");
        }

        if (checkKey(UP))
        {
            System.out.println("Up arrow key pressed");
        }

        if (checkKey(DOWN))
        {
            System.out.println("Down arrow key pressed");
        }
    }

    // fuction for displaying a menu for each airport, 30 is height and 145 is the width
    // had to hard code it, otherwise it wouldn't work
    public void mouseClicked() {
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
        // } else {
        //     // if u click on any "blank space" (as in not a menu) then whatver menu was displayed will dissapear
        //     selectedAirport = null;
        }

        // funtion for when you click on an airplane you select it
        if (mouseX > 625 && mouseX < (625 + 150) && mouseY > 980 && mouseY < (980 + 50)) {
            selectedAirplane = airplane1;
        } else if (mouseX > 795 && mouseX < (795 + 150) && mouseY > 980 && mouseY < (980 + 50)) {
            selectedAirplane = airplane2;
        } else if (mouseX > 965 && mouseX < (965 + 150) && mouseY > 980 && mouseY < (980 + 50)) {
            selectedAirplane = airplane3;
        } else if (mouseX > 1135 && mouseX < (1135 + 150) && mouseY > 980 && mouseY < (980 + 50)) {
            selectedAirplane = airplane4;
        }

        if (mouseX > 1480 && mouseX < (1480 + 150) && mouseY > 1010 && mouseY < (1010 + 50)) {
            selectedPilot = pilot1;
        } else if (mouseX > 1640 && mouseX < (1640 + 150) && mouseY > 1010 && mouseY < (1010 + 50)) {
            selectedPilot = pilot2;
        }

    } // mouseClicked end

    // function for changing the colour of the airport box when you hover onto it
    boolean overRect(int x, int y, int width, int height)  {
        if (mouseX >= x && mouseX <= x+width && 
            mouseY >= y && mouseY <= y+height) {
          return true;
        } else {
          return false;
        }
    }
}
