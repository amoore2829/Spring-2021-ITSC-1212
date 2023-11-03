import java.awt.Color;
  public class Lab6PartB
{
  public static void main(String [] args)
  {
    Picture pic = new Picture(FileChooser.pickAFile());
    Turtle tom = new Turtle(pic);
    pic.show();
    //pic.explore(); 
    tom.penUp();
    tom.setPenColor(Color.white);
    tom.setPenWidth(5);
    tom.moveTo(245,50);
    tom.penDown();
    tom.moveTo(445,50);
    tom.moveTo(445,150);
    tom.moveTo(245,150);
    tom.moveTo(245,50);
    
  }
}