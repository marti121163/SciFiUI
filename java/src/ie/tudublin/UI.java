package ie.tudublin;

//import javafx.scene.control.Menu;
import processing.core.PApplet;
import processing.core.PImage;
import sun.java2d.pipe.ValidatePipe;

public class UI extends PApplet
{
    Airports selectedAirport;
    Airplanes selectedAirplane;

    Button buttonAirplane1;
    Button buttonAirplane2;
    Button buttonAirplane3;
    Button buttonAirplane4;
    //Plane plane1;

    PImage map;

    Airports airport1;
    Airports airport2;
    Airports airport3;
    Airports airport4;
    Airports airport5;
    Airports airport6;

    Airplanes airplane1;
    Airplanes airplane2;
    Airplanes airplane3;
    Airplanes airplane4;

    Pilots pilot1;
    Pilots pilot2;
    Pilots pilot3;

    Menus menuBox;

    boolean[] keys = new boolean[1024];

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
        size(1920, 1080);
        // Use fullscreen instead of size to make your interface fullscreen
        //fullScreen(); 
    }

    public void setup()
    {
        // this loads in my premade map
        map = loadImage("C:\\Users\\marty\\Desktop\\Projects\\OOP Assignment\\SciFiUI\\images\\map.png");

        // airport buttons setup
        airport1 = new Airports(this, 430, 500, width, height, "Val Verde Airport", "Val Verde", "25,000", "1986", "Something Fancy");
        airport2 = new Airports(this, 495, 76, width, height, "Los Santos Airport", "Los Santos", "95,000", "1956", "Something Fancy 2");
        airport3 = new Airports(this, 600, 290, width, height, "Yerba Airport", "Yerba", "24,500", "1996", "Something Fancy 3");
        airport4 = new Airports(this, 1350, 550, width, height, "Wakanda Airport", "Wakanda", "165,800", "1986", "Something Fancy 4");
        airport5 = new Airports(this, 1670, 140, width, height, "Tansia Airport", "Val Verde", "7,000", "2006", "Something Fancy 5");
        airport6 = new Airports(this, 1600, 285, width, height, "Panau Airport", "Panau", "116,000", "1916", "Something Fancy 6");

        // menu box outline
        menuBox = new Menus(this, 3, 686, 1916, 393, 30, 40);

        // airplanes
        airplane1 = new Airplanes("KIA728", "50", "30t", "28", "medium", "1998", "18/20");
        airplane2 = new Airplanes("MIB318", "130", "50t", "61", "low", "1989", "12/20");
        airplane3 = new Airplanes("BDE178", "250", "70t", "15", "high", "2007", "16/20");
        airplane4 = new Airplanes("JET042", "25", "10t", "5", "medium", "2012", "10/20");



        // pilots
        pilot1 = new Pilots("Carol Danvers", "Female", "12-06-1975", "Boston, MA, USA", "reseach ranks", "22");
        pilot2 = new Pilots("Martina Nieckarz", "Female", "23-10-1998", "Bray, Wicklow, IE", "reseach ranks", "5");
        pilot3 = new Pilots("Steve Rogers", "Male", "13-03-1958", "Brooklyn, New York, USA", "reseach ranks", "45");


        buttonAirplane1 = new Button(this, 625, 980, 150, 50, "Airplane 1");
        buttonAirplane2 = new Button(this, 795, 980, 150, 50, "Airplane 2");
        buttonAirplane3 = new Button(this, 965, 980, 150, 50, "Airplane 3");
        buttonAirplane4 = new Button(this, 1135, 980, 150, 50, "Airplane 4");


        //plane1 = new Plane(this, width / 2, height * .75f, 50);
        radar = new Radar(this, 1, width / 2, height / 2, 100);

    }

    public void renderMenu() {
        //menuBox.render();
        // renders outline
        if (selectedAirport != null) {
            menuBox.render();
            menuBox.airportInfoTemp();
            menuBox.airportInfo(selectedAirport);

            //airplane selection buttons
            buttonAirplane1.render();
            buttonAirplane2.render();
            buttonAirplane3.render();
            buttonAirplane4.render();


            // this lets you hover over different airplanes and decide on which one you want to use
            if (mouseX > 625 && mouseX < (625 + 150) && mouseY > 980 && mouseY < (980 + 50)) {
                menuBox.airplaneSelection(airplane1);
            } else if (mouseX > 795 && mouseX < (795 + 150) && mouseY > 980 && mouseY < (980 + 50)) {
                menuBox.airplaneSelection(airplane2);
            } else if (mouseX > 965 && mouseX < (965 + 150) && mouseY > 980 && mouseY < (980 + 50)) {
                menuBox.airplaneSelection(airplane3);
            } else if (mouseX > 1135 && mouseX < (1135 + 150) && mouseY > 980 && mouseY < (980 + 50)) {
                menuBox.airplaneSelection(airplane4);
            }
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
