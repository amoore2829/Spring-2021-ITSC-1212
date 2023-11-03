public class MealPlan {

  private double accountBalance = 1000.0;
  private int mealsLeft = 100;
 
  public MealPlan(double bal, int num) {
    accountBalance = bal;
    mealsLeft = num;

  }

  public void updateBalance(double costOfMeal) {
    accountBalance = accountBalance - costOfMeal;
    changeMealsLeft();

  }
  public void changeMealsLeft() {
    mealsLeft --;
  }

  public double getBalance() { 
    return accountBalance;

  }
}