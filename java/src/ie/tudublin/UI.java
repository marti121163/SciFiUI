package ie.tudublin;

//import javafx.scene.control.Menu;
import processing.core.PApplet;
import processing.core.PImage;

public class UI extends PApplet
{
    Button b;
    Plane plane1;

    PImage map;

    Airports airport1;
    Airports airport2;
    Airports airport3;
    Airports airport4;
    Airports airport5;
    Airports airport6;

    Menus menuBox1;
    Menus menuBox2;
    Menus menuBox3;

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
        //size(800, 800);
        // Use fullscreen instead of size to make your interface fullscreen
        fullScreen(); 
    }

    public void setup()
    {
        // this loads in my premade map
        map = loadImage("C:\\Users\\marty\\Desktop\\Projects\\OOP Assignment\\SciFiUI\\images\\map.png");

        // airports setup
        airport1 = new Airports(this, 430, 500, 135, 30, "Val Verde Airport");
        airport2 = new Airports(this, 495, 76, 145, 30, "Los Santos Airport");
        airport3 = new Airports(this, 600, 290, 120, 30, "Yerba Airport");
        airport4 = new Airports(this, 1350, 550, 130, 30, "Wakanda Airport");
        airport5 = new Airports(this, 1670, 140, 120, 30, "Tansia Airport");
        airport6 = new Airports(this, 1600, 285, 120, 30, "Panau Airport");

        menuBox1 = new Menus(this, 3, 686, 600, 390, "menu1");
        menuBox2 = new Menus(this, 603, 686, 714, 390, "menu2");
        menuBox3 = new Menus(this, 1317, 686, 600, 390, "menu3");

        b = new Button(this, 50, 50, 100, 50, "SELECT");
        plane1 = new Plane(this, width / 2, height * .75f, 50);
        radar = new Radar(this, 1, width / 2, height / 2, 100);

    }

    Radar radar;

    public void draw()
    {
        background(0);

        image(map, 0, 0);

        // airports
        airport1.render();
        airport2.render();
        airport3.render();    
        airport4.render();
        airport5.render();
        airport6.render();

        // menu boxes
        menuBox1.render();
        menuBox2.render();
        menuBox3.render();

        //b.render();

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
}

