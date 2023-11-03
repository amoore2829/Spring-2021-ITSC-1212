import java.util.Scanner;

public class DayOfTheWeek{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
      System.out.println("Month");
      int month = scanner.nextInt();
      if (month < 1 || month > 12) {
        System.out.println("Choose from January (1) to December (12)");
      }
      System.out.println("Day");
      int day = scanner.nextInt();
      if (day < 1 || day > 31){
        System.out.println("Choose from the first day (1) to the last day (31) of the month");
      }
      
    }
  }

        