public class CheckSwitch {
  
  public static void main (String[] args) {   
    
        char fruit1 = 'M';
        char fruit2 = 'O';

        switch(fruit1)
        {
            case 'M':
                System.out.println("Mango");
                break;
            case 'P':
                System.out.println("Peach");
                break;
            case fruit2:
                System.out.println("Orange");
                break;
            default:
                System.out.println("Grapes");
        }
    }
}