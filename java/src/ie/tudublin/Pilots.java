package ie.tudublin;

import processing.core.PApplet;

public class Pilots 
{


    // pilot details
    private String pilotName;
    private String gender;
    private String dob;
    private String age;
    private String rank;
    private String yrsOfExperience;


    public Pilots (String pilotName, String gender, String dob, String age, String rank, String yrsOfExperience)
    {
        // pilot selection & info
        this.pilotName = pilotName;
        this.gender = gender;
        this.dob = dob;
        this.age = age;
        this.rank = rank;
        this.yrsOfExperience = yrsOfExperience;
    }

}    