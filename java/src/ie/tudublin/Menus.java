package ie.tudublin;

public class Menus
{
    UI ui;
    private float x;
    private float y;
    private float width;
    private float height;
    private float smallBoxSize;
    private float bigBoxSize;

    public Menus(UI ui, float x, float y, float width, float height, float smallBoxSize, float bigBoxSize)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.smallBoxSize = smallBoxSize;
        this.bigBoxSize = bigBoxSize;
    }

    public void render()
    {
        ui.noFill();
        ui.stroke(255);
        ui.rect(x, y, width, height);
        ui.fill(255);
        ui.textSize(30);
        ui.line(5, 730, 1920, 730);
        
        ui.noFill();
        // small left box
        ui.rect(x, y, width*(smallBoxSize/100), height);
        // big middle box
        ui.rect(x + width*(smallBoxSize/100), y, width*(bigBoxSize/100), height);
    }

    public void airplaneInfo() {

    }

    public void airportInfo(Airports airport) {
        ui.stroke(0);
        ui.text(airport.getName(),800, 500);
    }

    public void airplaneSelection() {

    }

    public void pilotSelection() {

    }

    public void valVerdeMenu(){
        ui.text("AIRPORT MENU", 300, 705);
        ui.text("AIRPLANE SELECTION", 957, 705);
        ui.text("PILOT SELECTION", 1627, 705);
    }



    // if LS airport is clicked
    //   show 3 menus
    //      if user clicks "next arrow"
    //          display next airplane avilable


}