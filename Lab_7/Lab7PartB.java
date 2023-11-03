/* Turtle Drawing Program Lab 7, Part B */
/* Started by Celine Latulipe , modified by Bruce Long*/

public class Lab7PartB {
  public static void main(String [] args) 
  {
    /* Create the world */
    World w = new World();
    
    /* Create the turtle, call him Tom */
    Turtle tom = new Turtle(w);
    
    /* test the getDistance2() method */
    double dist = tom.getDistance2();
    System.out.println("This should print out the value 400. Value is: " + dist);
    
    tom.moveTo(500, 400);
   dist = tom.getDistance2();
    System.out.println("This should print out the value 640. Value is: " + dist);
    
    tom.moveTo(400, 500);
    dist = tom.getDistance2();
    System.out.println("Value is: " + dist);
    
    // TODO: Add a third test case that you make up
   
  }
}