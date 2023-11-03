/**
 * Auto Generated Java Class.
*/
public class RainSimulator {

  public RainSimulator() {
    /* constructor */
    accumulation = 0;
    currentRainfallRate = 0.0;
  }
  public void newRainfall(int amount) {
    accumulation += amount;
  }
  
  public void checkRecord() {
    int lastYearsRecord = 27;
    if (accumulation > lastYearsRecord) {
      System.out.println("New Record Set!");
      lastYearsRecord = accumulation;
    }
  }
  
  /* fields */
  private int accumulation;
  private int annualAccumulation;
  private double currentRainfallRate;
}