public class Student{
  
  private String stdName;
  
  private int stdAge;
  
  private String stdAddress;
  
  private int stdId = 1;
  public Student(){
    
    stdName="Alex";
    
    stdAge = 21;
    
    stdAddress="Charlotte";
  }
  public Student(String name, int age, String add)
  {
    
    stdName=name;
    
    stdAge = age;
    
    stdAddress=add;
  }
  public void disp() {
    
    System.out.println ("Information of a student");
    
    System.out.println("Student Name: "+ stdName);
    
    System.out.println("Student Salary: "+ stdAge);
    
    System.out.println("Student Address: "+ stdAddress);
    
  }
  public int getStudentId()
  {
    return stdId;
  }
  
  
  
  public void setStudentId(int id)
    
  {
    
    stdId= id;
    
  }
  
  
  
  public static void main(String[] args){
    
    Student niner = new Student();
    niner.disp();
    
    System.out.println("Student ID Number: "+ niner.getStudentId());
    
    
    
    Student lily = new Student("Lily", 15, "Roanoke");
    
    lily.setStudentId(2);
    
    System.out.println("Student ID Number: "+ lily.getStudentId());
    
  }
}