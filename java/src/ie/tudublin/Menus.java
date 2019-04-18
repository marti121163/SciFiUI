package ie.tudublin;

public class Menus
{
    UI ui;
    private float x;
    private float y;
    private float width;
    private float height;
    private String text;

    public Menus(UI ui, float x, float y, float width, float height, String text)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.text = text;
    }

    public void render()
    {
        ui.noFill();
        ui.stroke(255);
        ui.rect(x, y, width, height);
        ui.fill(255);
        ui.textSize(30);
        // ui.text("AIRPLANE", 300, 705);
        // ui.text("SETTINGS", 957, 705);
        // ui.text("PILOT", 1627, 705);
        ui.text("FLIGHT TRACKER SIMULATOR", 975, 20);
    }

    public void valVerdeMenu(){
        ui.text("AIRPORT MENU", 300, 705);
    }

    // if LS airport is clicked
    //   show 3 menus
    //      if user clicks "next arrow"
    //          display next airplane avilable


}