/* Turtle Drawing Program Lab 3, Part B */
/* Started by Celine Latulipe, edited by Bruce Long */

public class Lab3PartB {
  public static void main(String [] args) 
  {
    /* Create the world */
    World w = new World();
    
    /* Create the turtle, call him Tom, put him at (x,y) (100, 100) */
    Turtle tom = new Turtle(100, 100, w);
    
    tom.forward(50);
    tom.turn(60);
    tom.forward(50);
    tom.turn(60);
    tom.forward(50);
    tom.turn(60);
    tom.forward(50);
    tom.turn(60);
    tom.forward(50);
    tom.turn(60);
    tom.forward(50);
    tom.turn(60);
    
    /* TODO: Make tom draw a hexagon */
    /* HINT1: Hexagons are six-sided figures where:
     * all sides are the same length, 
     * all the interior angles are the same, and
     * the sum of all the interior angles is given by:
     *    180*(n-2) = 180*(6-2) = 180*4 = 720
     * HINT2: You should be able to do this by repeatedly calling:
     *    tom.forward(<length of side>) then
     *    tom.turn(<angle>)  [positive angle values turn right]
     * NOTE: Make each side of the hexagon 50 pixels long */
    

  }
}
