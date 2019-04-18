package ie.tudublin;

public class Menus
{
    UI ui;
    private float x;
    private float y;
    private float width;
    private float height;
    private String text;

    public Menus(UI ui, float x, float y, float width, float height)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void render()
    {
        ui.noFill();
        ui.stroke(255);
        ui.rect(x, y, width, height);
        ui.fill(255);
        ui.textSize(30);
        ui.text("AIRPLANE", 300, 705);
        ui.text("SETTINGS", 957, 705);
        ui.text("PILOT", 1627, 705);
        ui.line(5, 730, 1914, 730);
        ui.text("FLIGHT TRACKER SIMULATOR", 975, 20);
    }

    public void valVerdeMenu(){
        ui.text("AIRPORT MENU", 300, 705);
        ui.text("AIRPLANE SELECTION", 957, 705);
        ui.text("PILOT SELECTION", 1627, 705);


    }

    public void losSantosMenu(){
        ui.text("AIRPORT MENU", 300, 705);
        ui.text("AIRPLANE SELECTION", 957, 705);
        ui.text("PILOT SELECTION", 1627, 705);

    }

    public void yerbaMenu(){
        ui.text("AIRPORT MENU", 300, 705);
        ui.text("AIRPLANE SELECTION", 957, 705);
        ui.text("PILOT SELECTION", 1627, 705);
    }

    public void panauMenu(){
        ui.text("AIRPORT MENU", 300, 705);
        ui.text("AIRPLANE SELECTION", 957, 705);
        ui.text("PILOT SELECTION", 1627, 705);
    }

    public void tansiaMenu(){
        ui.text("AIRPORT MENU", 300, 705);
        ui.text("AIRPLANE SELECTION", 957, 705);
        ui.text("PILOT SELECTION", 1627, 705);
    }

    public void wakandaMenu(){
        ui.text("AIRPORT MENU", 300, 705);
        ui.text("AIRPLANE SELECTION", 957, 705);
        ui.text("PILOT SELECTION", 1627, 705);
    }


    // if LS airport is clicked
    //   show 3 menus
    //      if user clicks "next arrow"
    //          display next airplane avilable


}