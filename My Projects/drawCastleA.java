public static void drawCastleA (String[] args)
{
  World world = new World(640, 480);
  Turtle t8 = new Turtle(0,0,world);
  t8.penUp;
  t8.moveTo(120, 160);
  t8.penDown();
  t8.forward(120);
  t8.turnRight();
  t8.forward(100);
  t8.turnLeft();
  t8.forward(40);
  t8.turn(30);
  t8.forward(40);
  t8.turn(120);
  t8.forward(40);
}
  
  
  
  