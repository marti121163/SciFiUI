package ie.tudublin;

import processing.core.PApplet;

public class Plane
{
    private float x;
    private float dx = 1;
    private float y;
    private float diameter;
    private float radius;
    UI ui;

    public Plane(UI ui, float x, float y, float diameter)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.diameter = diameter;
        radius = diameter / 2;
    }
    
    public void render()
    {
        ui.stroke(255);
        ui.noFill();
        ui.ellipse(x, y, diameter, diameter);
        // Static field
        ui.textAlign(PApplet.CENTER, PApplet.CENTER);
        ui.text("Plane", x, y);

        ui.line(42, 14, 42, 70);
        ui.line(42, 14, 50, 05);
        ui.line(50, 05, 57, 13);
        ui.line(57, 14, 57, 70);
        ui.line(42, 70, 50, 79);
        ui.line(50, 79, 57, 70);
        ui.line(42, 63, 57, 63);
        ui.line(42, 30, 57, 30);
        ui.line(42, 22, 57, 22);
        ui.line(44, 73, 55, 73);
        ui.line(34, 76, 44, 73);
        ui.line(34, 76, 34, 81);
        ui.line(34, 81, 50, 78);
        ui.line(50, 78, 65, 81);
        ui.line(65, 81, 65, 76);
        ui.line(65, 76, 55, 73);
        ui.line(57, 25, 84, 55);
        ui.line(84, 55, 84, 58);
        ui.line(84, 58, 82, 58);
        ui.line(82, 58, 66, 48);
        ui.line(66, 48, 57, 48);
        ui.line(42, 25, 16, 55);
        ui.line(16, 55, 16, 58);
        ui.line(16, 58, 18, 58);
        ui.line(18, 58, 34, 48);
        ui.line(34, 48, 42, 48);

    }

    public void update()
    {
        x += dx;
        if ((x > ui.width - radius) || (x < radius))
        {
            dx *= -1;
        }
    }
}
