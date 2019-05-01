# SciFi UI Project

Name: Martyna Nieckarz

Student Number: C17389181


# Description of the assignment

This assignment required an implementation of a SciFi UI. I decided to make a airplane tracking map. I came across this idea after doing reasearch on different UIs. 
It involves generating airplanes and sending them to different locations. The user gets to see the airplane travel from one destination to another, as well as being able to choose the airplane, pilot and change the colours of airplanes, even mid flight.


# Instructions

You begin by clicking on an airport of your choice, once you do that three different sections will pop up at the bottom part of the screen. First one from the left displays the information about the airport, middle one lets you hover onto different airplanes and see which one you want to choose, to select it simply click the corresponding button. The menu on the right lets you do the same thing you did for the airplane but for a pilot this time, you get to choose from two different pilots.

Once you have made both of your choices two buttons will pop up right in the middle of the screen just above the menu box outline. One is CLEAR which will just make the menu dissapear and the other one is GENERATE. Once you click that one you will generate an airplane containing the information you previously chose (airplane and pilot selection). Next you should click on the airport. Once you do that similar to the last time, you will have three different sections at the bottom of the screen. Ones on the left and right simply show you information about the airplane and pilot you chose. The menu in the middle lets you change the colour of all the current generated airplanes. If you decided to change the colour you will need to click the airplane again. Once you do that you can click on the airport you can send the airplane to.

Whatever airplane you chose can only be flying at one instance of time. If you try to generate airplane 1 at another airport while it's already flying from some other destination after its been generated than it will dissapear. Therefore you can have maximum 4 airplanes flying on the map at once.


# How it works
I have these classes in my project:

### Button 
This is a superclass that other button classes inherit.

### AirplaneButton, PilotButton, BasicButton 
These all extend from Button class

### UI
This is the most important class as this is where most of the stuff happens. Things like airports are set up, buttons are rendered, array lists are made and it also includes the mouseClicked() function which deals with all the button clicking.
My buttons are all created using for loops and also are rendered using them. I used arrays to store them which allowed me to use for loops rather than hard coding the values. In setup() I set up all of my objects like airplanes, airports, images etc. MenuRender() function renders the right menu depending on weather the user has clicked on one of the airports or the airplane. In draw() the airports get rendered as they always stay on the screen no matter what the user does.

### Menus 
All of my functions for calling menus are set up in this class. Each function e.g. PilotSelection displays some text and uses .get() to get information and places it next to it. All menu functions are similar.

Example:
```Java
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
```    

### Airplanes, Pilots, Airports
The three classes for the objects and their attributes I used in the assignment.
Example:
```Java
public Pilots (String pilotName, String gender, String dob, String placeOfBirth, String rank, PImage pilotIcon)
    {
        // pilot selection & info
        this.pilotName = pilotName;
        this.gender = gender;
        this.dob = dob;
        this.placeOfBirth = placeOfBirth;
        this.rank = rank;
        this.pilotIcon = pilotIcon;
    }
 ```   

### Radar
This is for the radar

### Main

# What I am most proud of in the assignment

Previous to doing this assignment I feel like I didn't have enough practise making interactive programms, so by doing this assignment I really got to practise and really improve at logical thinking. I used to have a bad habit of hard coding a lot of things, not I learned how to avoid that by using loops and other useful things. What I'm the most proud of is the fact that I actually managed to make the planes be sent from one location to another, it seemed quite difficult to do at the start but I'm happy I managed to get it done.

# Code examples:

Example of my use of Inheritance:

```Java

public class AirplaneButton extends Button
{
    private Airplanes airplane;
```

PVector, translate & rotate:

```Java
int x = (int)(destinationAirport.getX() + destinationAirport.getWidth() / 2);
        int y = (int)(destinationAirport.getY() + destinationAirport.getHeight() * (float)1.5);
        PVector dest = new PVector(x, y);
        PVector nextPoint = PVector.sub(dest, pos);
        float dist = nextPoint.mag();
        // gets a single unit so, moving the plane one unit in a certain direction is possible
        nextPoint.normalize();
        pos.add(nextPoint);
        // this rotates it
        rotation = (float) Math.atan2(nextPoint.y, nextPoint.x) + PApplet.HALF_PI;
```
push.Matrix() and pop.Matrix()

```Java
	ui.pushMatrix();

        // lets you change the colour of all currently generated planes
        if (ui.selectedColour == 1){
            //red
            ui.fill(255, 0, 0);
        } else if (ui.selectedColour == 2){
            //blue
            ui.fill(0, 0, 255);
        } else if (ui.selectedColour == 3){
            //green
            ui.fill(0, 255, 0);
        } else if (ui.selectedColour == 4){
            //black
            ui.fill(80);
        } else {
            //this makes is so that the very first generated airplane will be black, after that you get to change it
            ui.fill(80);
        }
        // this is needed because otherwise the airplane will get drawn at 0, 0 where the rotation is done
        ui.translate(pos.x, pos.y);
        ui.rotate(rotation);
```
For loop and if statement:

```Java
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
```

This is my youtube video of assignemnt:

[![YouTube](https://i.ytimg.com/vi/XJv3F989_mY/hqdefault.jpg?sqp=-oaymwEZCNACELwBSFXyq4qpAwsIARUAAIhCGAFwAQ==&rs=AOn4CLDbPX2LPiL7o6LF3hgeUCRT4RgNag)](https://youtu.be/XJv3F989_mY)

