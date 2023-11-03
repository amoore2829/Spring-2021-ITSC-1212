/* Practicing basic algorithms.  Part of Lab 6 */
/* Accepting multiple inputs                   */
import java.util.Scanner;

public class Lab6PartE
{
  public static void main(String [] args) 
  {
// Prompt user to enter original price of clothing taken as a double
    System.out.println("Enter the original price of the item of clothing ");
    
    // Accept data from user
    Scanner keyboard = new Scanner(System.in);
    // Convert string entered to ...
    double originalPrice = keyboard.nextDouble();
     
    System.out.println("Enter the discount percentage of the item of clothing as a decimal ");
    double discountPercentage = keyboard.nextDouble();
    
    // Perform necessary calculations.  Replace =0 below with the proper calculation.
    double salePrice = originalPrice - (originalPrice*discountPercentage); 
    double salesTax = salePrice *.06;
    double finalPrice =  salePrice + salesTax;
    // Display results
    System.out.println("The original price of the item was " + "$" + originalPrice + 
                       " but it has a discount of  " + discountPercentage + " with a sales tax of " + salesTax + 
    "which makes the final price of this item " + finalPrice);
  }
}