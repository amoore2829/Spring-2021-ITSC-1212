public class DentalClinic {
  private boolean providesOrthoCare;
  private int numDoctors = 0;
  private int numPatients = 0;
  private String clinicName;
  ...
  public DentalClinic(int doctors, boolean ortho) {
    numDoctors = doctors;
    providesOrthoCare = ortho;
  }
  public void addPatients(int numNewPatients) {
     numPatients = numPatients + numNewPatients;
  }
  public int getNumDoctors() { ... }
  ...
}
 