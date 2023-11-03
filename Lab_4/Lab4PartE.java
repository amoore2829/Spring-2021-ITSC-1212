/* Turtle Drawing Program Lab 4, Part D */
/* Started by Bruce Long */

import java.awt.Color;

public class Lab4PartE {
  public static void main(String [] args) 
  {
    /* Create a world named w */
    World w = new World();
    
    /* Create a turtle, call him tom, put him at (x=100, y=200) in the world named w */
    Turtle johnathan = new Turtle(100, 200, w);
    
    /* Set tom's pen color to red.  */
    johnathan.setPenColor(Color.red);
    
    /* Draw a hexagon using multiple parameters */   
    drawHexP(johnathan, 290, 155, 60, 180, Color.blue, 5);
    drawHexP(johnathan, 240, 250, 60, 180, Color.red, 5);
    drawHexP(johnathan, 185, 157, 60, 180, Color.green, 5);
    
    
  }
  
// define a method to draw a hexagon of variable line lengths
  public static void drawHexP(Turtle johnathan, int x, int y, int length, double heading, Color color, int lineWidth)
  {
    /* Make tom draw a hexagon */
    johnathan.setHeading(heading);
    johnathan.setPenWidth(lineWidth);
    johnathan.penUp();
    johnathan.moveTo(x, y);
    johnathan.setPenColor(color);
    johnathan.penDown();
    johnathan.forward(length);
    johnathan.turn(60);
    johnathan.forward(length);
    johnathan.turn(60);
    johnathan.forward(length);
    johnathan.turn(60);
    johnathan.forward(length);
    johnathan.turn(60);
    johnathan.forward(length);
    johnathan.turn(60);
    johnathan.forward(length);
    johnathan.turn(30);
  }
  
}