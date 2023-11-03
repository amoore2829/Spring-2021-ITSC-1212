public class DogPark {
  
  private int numDogs = 0;
  private double parkSize = 0.0;
  
  public DogPark(int dogs, double size) {
    
    numDogs = dogs;
    parkSize = size;
    
  }
  
  
  
  public void calcDogsPerParkSize() {
    DogPark newPark = new DogPark(5,50.0);
    
    double parkDensity = parkSize / numDogs;
    
  }
  
  public double getParkDensity() {
    return parkDensity;
    
  }
  
}