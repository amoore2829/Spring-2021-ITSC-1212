import java.awt.Color;

public class Lab5PartA 
{   
  public static void main(String [] args) 
  {
    // create a world
    World w = new World();
    
    /* Create a turtle */
    Turtle jen = new Turtle(200, 200, w);

    /* TODO: Change the turtle's state below here */
    jen.setColor(Color.red);
    jen.setPenColor(Color.blue);
    jen.setPenWidth(5);
    jen.turn(45.0);

    
    /* Don't change these lines */
    jen.forward(50); 
    System.out.println(jen); // this will print out information about the turtle jen to the console

  }
  
 
}


 