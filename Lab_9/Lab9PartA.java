// Lab 9, Part A Created by Celine Latulipe, modified by Bruce Long    
public class Lab9PartA {   
  public static void main(String[] args) throws InterruptedException  
  {     
    // get a picture
    String filename;
    
    if (args.length != 0) {
      // got a filename passed into program as a parameter
      // don't change this part of the code needed by the Autograder.
      filename = args[0];
      System.out.println("Filename passed in " + filename);
    } else {
      // ask user for a picture
      filename = FileChooser.pickAFile();
      System.out.println("User picked file " + filename);
    }
    
 
    int number = 1;
    Picture pic = new Picture(filename);
    // get a world the correct size for the picture
    World w = new World(pic.getWidth(), pic.getHeight());
    // put the picture in the world
    w.setPicture(pic);
    // tell the world to update so we see the new picture
    w.modelChanged();
    
    while (number <= 10) {
    // now fade the picture once
    pic.fade();
    // tell the world to update so we see the new picture
    w.modelChanged();
    // wait a half a second
    Thread.sleep(500); 
    number++;
  }
}
}
