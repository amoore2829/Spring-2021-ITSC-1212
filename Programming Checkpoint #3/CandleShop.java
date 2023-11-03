import java.util.Scanner;                       // Scanner 

public class CandleShop
{
  public static void main(String [] args) 
  {
    // defines candle costs for each type of candle
    double candleType1Cost = 2.50;
    double candleType2Cost = 3.75;
    double candleType3Cost = 5.99;
    
    //defines burn time for each type of candle
    int candleType1BurnTime = 5;
    int candleType2BurnTime = 7;
    int candleType3BurnTime = 12;
    
    System.out.println("Welcome to Johnathan's Candle Shop!");
    
    // asks user to input amount of candles they bought
    System.out.println("How many candles of Type 1 did you purchase?");
    Scanner candle1 = new Scanner(System.in);  
    int candleType1 = candle1.nextInt();
    
    System.out.println("How many candles of Type 2 did you purchase?");
    Scanner candle2 = new Scanner(System.in);  // Include these two
    int candleType2 = candle2.nextInt();
    
    System.out.println("How many candles of Type 3 did you purchase?");
    Scanner candle3 = new Scanner(System.in);  // Include these two
    int candleType3 = candle3.nextInt();
    
    //calculates final candle cost for each type of candle 
    double finalCandle1Cost = candleType1 * candleType1Cost;
    double finalCandle2Cost = candleType2 * candleType2Cost;
    double finalCandle3Cost = candleType3 * candleType3Cost;
    
    //calculates total burn time for each candle type
    int totalBurnTimeCandle1 = (candleType1BurnTime * candleType1);
    double costPerMinute1 = (totalBurnTimeCandle1 / 60);
    
    int totalBurnTimeCandle2 = (candleType2BurnTime * candleType2);
    double costPerMinute2 = (totalBurnTimeCandle2 / 60);
    
    int totalBurnTimeCandle3 = (candleType3BurnTime * candleType3);
    double costPerMinute3 = (totalBurnTimeCandle3 / 60);
    
    //this would be the burn time for the purchase and not one of each candle
    int totalBurnTime = (candleType1BurnTime * candleType1) + 
      (candleType2BurnTime * candleType2) + (candleType3BurnTime * candleType3);
    
    //calculates the total cost per minute of each candle purchased
    double totalCostPerMinute = (costPerMinute1 + costPerMinute2 + costPerMinute3);
    
    //calculates the total price of the amount and type of candles the user bought
    double totalPrice = finalCandle1Cost + finalCandle2Cost + finalCandle3Cost;
    //displays all of the values
    System.out.println("Your total cost for " + candleType1 + " of candle type 1, " 
                         + candleType2 + " of candle type 2, and " + candleType3  + 
                       " of candle type 3 is " + "$" + totalPrice + " with a total burn time of " 
                         + totalBurnTime + " hours" + " and a total cost-per-minute of " + "$" +
                       totalCostPerMinute);
    
    
  }
}