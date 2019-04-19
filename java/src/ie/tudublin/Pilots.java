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

    /**
     * @return the pilotName
     */
    public String getPilotName() {
        return pilotName;
    }

    /**
     * @param pilotName the pilotName to set
     */
    public void setPilotName(String pilotName) {
        this.pilotName = pilotName;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * @return the age
     */
    public String getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * @return the rank
     */
    public String getRank() {
        return rank;
    }

    /**
     * @param rank the rank to set
     */
    public void setRank(String rank) {
        this.rank = rank;
    }

    /**
     * @return the yrsOfExperience
     */
    public String getYrsOfExperience() {
        return yrsOfExperience;
    }

    /**
     * @param yrsOfExperience the yrsOfExperience to set
     */
    public void setYrsOfExperience(String yrsOfExperience) {
        this.yrsOfExperience = yrsOfExperience;
    }

}    