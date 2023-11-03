/* Lab 1: Created by Beth Simon  * Date: Sept 29, 2008  */  
public class Lab1 {   
  public static void main(String [] args)   
  {     
    World w = new World();     
    Turtle jose = new Turtle(100,50,w); //Creates a turtle in w at (x,y) (100,50)          
    //Make a U shape
    jose.turn(180); //Face down
    jose.forward(55);     
    jose.turn(90);     
    jose.forward(30);    
    jose.turn(90);    
    jose.forward(55);        
  }
}  