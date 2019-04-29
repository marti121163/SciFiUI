// package ie.tudublin;

// import processing.core.PApplet;

// public class Plane
// {
//     private float x;
//     private float dx = 1;
//     private float y;
//     private int width;
//     private int length;
//     private Airports startingAirport;
//     private Airports destinationAirport;
//     private int speed;
//     UI ui;

//     public Plane(UI ui, int width, int length, Airports startingAirport, int speed)
//     {
//         this.ui = ui;
//         this.x = startingAirport.getX() + startingAirport.getWidth() / 2;
//         this.y = startingAirport.getY() - startingAirport.getHeight();
//         this.width = width;
//         this.length = length;
//         this.startingAirport = startingAirport;
//         this.speed = speed;
//     }
    
//     public void render()
//     {
//         ui.stroke(255);
//         ui.noFill();
//         // Static field
//         ui.textAlign(PApplet.CENTER, PApplet.CENTER);

       
        

//     }

//     // public void update()
//     // {
//     //     x += dx;
//     //     if ((x > ui.width - radius) || (x < radius))
//     //     {
//     //         dx *= -1;
//     //     }
//     // }

//     // width = body width and length = body length
// 	public void draw() {
//         ui.stroke(255);
//         //ui.noFill();
//         ui.fill(80);
//         // body and tip
//         ui.rect(x - width/2, y - length/2, width, length);
//         ui.triangle(x - width/2, y - length/2, x, y - length/2 - width, x + width/2, y - length/2);
//         // ui.line(x - width/2, y - length/2, x, y - length/2 - width);
//         // ui.line(x + width/2, y - length/2, x, y - length/2 - width);

//         //wings
//         float leftWingX = x - length;
//         float WingY = y + length/2;
//         float rightWingX = x + length;
        
//         ui.triangle(x - width/2, y - length/4, leftWingX, WingY, leftWingX + (length/3)*2, WingY - length/4);
//         ui.triangle(x + width/2, y - length/4, rightWingX, WingY, rightWingX - (length/3)*2, WingY - length/4);
//         ui.triangle(x - width/2, y - length/4, leftWingX + (length/3)*2, WingY - length/4, x - width/2, WingY - length/4);
//         ui.triangle(x + width/2, y - length/4, rightWingX - (length/3)*2, WingY - length/4, x + width/2, WingY - length/4);

//         // ui.line(x - width/2, y - length/4, leftWingX, WingY);
//         // ui.line(x + width/2, y - length/4, rightWingX, WingY);
//         // ui.line(leftWingX, WingY, leftWingX + (length/3)*2, WingY - length/4);
//         // ui.line(rightWingX, WingY, rightWingX - (length/3)*2, WingY - length/4);
//         // ui.line(leftWingX + (length/3)*2, WingY - length/4, x - width/2, WingY - length/4);
//         // ui.line(rightWingX - (length/3)*2, WingY - length/4, x + width/2, WingY - length/4);

//         // back
//         ui.triangle(x - width/2, y + length/2, x, y + length/2 + width, x + width/2, y + length/2);
//         // ui.line(x - width/2, y + length/2, x, y + length/2 + width);
//         // ui.line(x + width/2, y + length/2, x, y + length/2 + width);

//         // back wings
//         float backPointY = y + length/2 + width;
//         // ui.line(x, backPointY, x + length/3, backPointY + width/2);
//         // ui.line(x, backPointY - width/2, x + length/3, backPointY);

//         // ui.line(x, backPointY, x - length/3, backPointY + width/2);
//         // ui.line(x, backPointY - width/2, x - length/3, backPointY);

//         ui.quad(x, backPointY, x, backPointY - width/2, x + length/3, backPointY, x + length/3, backPointY + width/2);
//         ui.quad(x, backPointY, x, backPointY - width/2, x - length/3, backPointY, x - length/3, backPointY + width/2);


//         // ui.line(42, 14, 42, 70);
//         // ui.line(42, 14, 50, 05);
//         // ui.line(50, 05, 57, 13);
//         // ui.line(57, 14, 57, 70);
//         // ui.line(42, 70, 50, 79);
//         // ui.line(50, 79, 57, 70);
//         // ui.line(42, 63, 57, 63);
//         // ui.line(42, 30, 57, 30);
//         // ui.line(42, 22, 57, 22);
//         // ui.line(44, 73, 55, 73);
//         // ui.line(34, 76, 44, 73);
//         // ui.line(34, 76, 34, 81);
//         // ui.line(34, 81, 50, 78);
//         // ui.line(50, 78, 65, 81);
//         // ui.line(65, 81, 65, 76);
//         // ui.line(65, 76, 55, 73);
//         // ui.line(57, 25, 84, 55);
//         // ui.line(84, 55, 84, 58);
//         // ui.line(84, 58, 82, 58);
//         // ui.line(82, 58, 66, 48);
//         // ui.line(66, 48, 57, 48);
//         // ui.line(42, 25, 16, 55);
//         // ui.line(16, 55, 16, 58);
//         // ui.line(16, 58, 18, 58);
//         // ui.line(18, 58, 34, 48);
//         // ui.line(34, 48, 42, 48);
// 	}
// }
