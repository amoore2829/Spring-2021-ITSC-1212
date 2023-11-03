public class SwitchTest  {

   public static void main (String[] args) { 
      int num = 99;
      switch (num){
         case (0): case(1): case (2):
            System.out.println("0");
         case (3): case(4):
            System.out.println("1");
            break;
         case (5):
            System.out.println("2");
            break;
         case (6):
            System.out.println("3");
            break;
         default:
            System.out.println("null");
      } 
      System.out.println("");
   }
}