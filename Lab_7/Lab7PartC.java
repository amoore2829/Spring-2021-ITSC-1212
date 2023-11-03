/* Turtle Program Lab 7, Part C */
/* Started by Celine Latulipe */

public class Lab7PartC {
  public static void main(String [] args) 
  {
    /* Create the world */
    World w = new World();
    
    /* Create the first turtle, call her Jen */
    Turtle jen = new Turtle(w);
    
    /* Create the second turtle, call him Tom */
    Turtle tom = new Turtle(w);
    
    // Move them around
    tom.forward(30);
    jen.turn(20);
    jen.forward(40);
    
    // check if close (should return true)
    boolean result= tom.isTurtleClose(jen, 50);
    System.out.println("Test 1: should print out true. result is: " + result);
    
    // TODO: add the second test, to check the false case (move turtles far away, then test)
    jen.forward(200);
    tom.moveTo(10, 300);
    boolean two= tom.isTurtleClose(jen, 5);
    System.out.println("Test 1: should print out true. result is: " + two);
  }
}