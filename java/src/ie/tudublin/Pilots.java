package ie.tudublin;

// import processing.core.PApplet;
import processing.core.PImage;

public class Pilots 
{
    // pilot details
    private String pilotName;
    private String gender;
    private String dob;
    private String placeOfBirth;
    private String rank;
    private PImage pilotIcon;


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
     * @return the placeOfBirth
     */
    public String getPlaceofBirth() {
        return placeOfBirth;
    }

    /**
     * @param placeOfBirth the placeOfBorth to set
     */
    public void setAge(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
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
     * @return the placeOfBirth
     */
    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    /**
     * @param placeOfBirth the placeOfBirth to set
     */
    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    /**
     * @return the pilotIcon
     */
    public PImage getPilotIcon() {
        return pilotIcon;
    }

    /**
     * @param pilotIcon the pilotIcon to set
     */
    public void setPilotIcon(PImage pilotIcon) {
        this.pilotIcon = pilotIcon;
    }

}    