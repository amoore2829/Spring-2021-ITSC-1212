/* Turtle Drawing Program Lab 6, Part C */
/* Started by Celine Latulipe */

import java.util.Scanner;                       // Include this line to import the Scanner utility

public class Lab6PartC
{
  public static void main(String [] args) 
  {
    // Part 1
    Scanner keyboard = new Scanner(System.in);  // Include these two
    int x = keyboard.nextInt();                 // lines for integers
    World world = new World(640, 480); /** creates new world */
    Turtle t8 = new Turtle(100, 200, world);
    drawHexagon(t8, x);
  }
  public static void drawHexagon(Turtle t8, int lineLength){
  t8.forward(lineLength);
  t8.turn(60);
  t8.forward(lineLength);
  t8.turn(60);
  t8.forward(lineLength);
  t8.turn(60);
  t8.forward(lineLength);
  t8.turn(60);
  t8.forward(lineLength);
  t8.turn(60);
  t8.forward(lineLength);
  t8.turn(60);
    
   
  }
}