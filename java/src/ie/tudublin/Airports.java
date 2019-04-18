package ie.tudublin;

import processing.core.PApplet;

public class Airports
{
    UI ui;
    private float x;
    private float y;
    private float width;
    private float height;
    private String text;


    public Airports(UI ui, float x, float y, float width, float height, String text)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.width = width = 145;
        this.height = height = 30;
        this.text = text;
    }


    public void render()
    {
        ui.noFill();
        ui.stroke(0);
        ui.rect(x, y, width, height);
        ui.textAlign(PApplet.CENTER, PApplet.CENTER);
        ui.fill(0);
        ui.textSize(15);
        ui.text(text, x + width * 0.5f, y + height * 0.5f);
    }

}