/**
 * ITSC 1212 CandlePurchase class
 * Created by Adam Whaley
 *
 * 
 *
 */


public class CandlePurchase {

  //Declare fields for CandlePurchase
  private int numType1;
  private int numType2;
  private int numType3;
  private final int PURCHASE_THRESHOLD = 7;
  Candle type1 = new Candle(1, 2.5, (5*60),.01);    // Create a Candle object for a Type 1 candle
  Candle type2 = new Candle(2, 3.75, (7*60), .03);   // Create a Candle object for a Type 2 candle
  Candle type3 = new Candle(3, 5.99, (12*60), .05);  // Create a Candle object for a Type 3 candle
  
  public CandlePurchase(int numType1, int numType2, int numType3) {
   int CandlePurchase = (numType1 + numType2 + numType3);

  }
  
  public double getSubTotal() {
   double SubTotal = (costType1 + costType2 + costType3);
  }
  
  public double getTotalTax() {
  //TODO
 
  }
  
  public int getTotalBurnTime() {
  //TODO
  }
  
  // method that calculates the grand total of a purchase
  // by combining the returns of getSubTotal and getTotalTax
  public double getTotal() {
 
    return getSubTotal() + getTotalTax();
   
  }
  
  public void getPurchaseBreakdown() {
  //TODO   
  }
  

}