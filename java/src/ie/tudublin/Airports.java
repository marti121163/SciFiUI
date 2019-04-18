package ie.tudublin;

import processing.core.PApplet;

public class Airports
{
    UI ui;
    private float x;
    private float y;
    private float width;
    private float height;
    private String name;

    public Airports(UI ui, float x, float y, float width, float height, String name)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.width = width = 145;
        this.height = height = 30;
        this.name = name;
    }


    public void render()
    {
        //ui.noFill();
        ui.fill(255, 255, 255);
        ui.stroke(0);
        ui.rect(x, y, width, height);
        ui.textAlign(PApplet.CENTER, PApplet.CENTER);
        ui.fill(0);
        ui.textSize(15);
        ui.text(name, x + width * 0.5f, y + height * 0.5f);

        if (ui.overRect((int)x, (int)y, (int)width, (int)height)) {
            ui.fill(230);
            ui.rect(x, y, width, height);
            ui.fill(0);
            ui.text(name, x + width * 0.5f, y + height * 0.5f);
        }
    }

    /**
     * @return the ui
     */
    public UI getUi() {
        return ui;
    }

    /**
     * @param ui the ui to set
     */
    public void setUi(UI ui) {
        this.ui = ui;
    }

    /**
     * @return the x
     */
    public float getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(float x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public float getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(float y) {
        this.y = y;
    }

    /**
     * @return the width
     */
    public float getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(float width) {
        this.width = width;
    }

    /**
     * @return the height
     */
    public float getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(float height) {
        this.height = height;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

}