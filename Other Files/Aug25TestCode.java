import java.util.Random;
public class Aug25TestCode {
  
  // Write a method that takes two int parameters
  // and returns the sum
  public static int mySum(int a, int b) {
    return a+b;
  }
  
  //Write a method that returns an array
  //that has random length
  //and each value is the index
  public static int[] randArray()
  {
    //Make sure to "import java.util.Random;"
    Random rng = new Random();
    //rng has a method called nextInt() that returns a random int
    int len = rng.nextInt();
    int[] myArr = new int[len];
    for(int i=0; i<len; i++)
    {
      myArr[i] = i;
    }
    return myArr;
  }
  
  //make a method that returns the factorial of an integer
  //factorial example: 7! = 7*6*5*4*3*2*1
  public static int factorial(int n) {
    int f = 1;
    for(int i=n; i>0; i--;)
    {
      f = f * i;
    }
    return f;
      
    
    
  {
    
  
    
  
  //make a method returns an int array that's adding two other int array parameters
  public static int[] addArrays(int[] a, int[] b)
  {
    /*
     c[0] = a[0] + b[0];
     c[1] = a[1] + b[1];
     c[i] = a[i] + b[i];
     c[n] = a[n] + b[n];
     */
     int[] c = new int[a.length];
     for(int i=0;i<a.length;i++)
     {
       c[i] = a[i] + b[i];
     }
     return c;
  }
  
  public static void main(String[] args) {
    //Print "Hello World!"
    System.out.println("Hello World!");
    
    int[] a = randArray();
    //Print out each value in the array
    for(int i=0; i<a.length; i++)
    {
      System.out.println(a[i]);
    }
  }
  
  //take in some iser input, and print it back out
  //Hint: Scanner
  import java.util.Scanner;
  Scanner scan = new Scanner(System.in);
 System.out.prinln(scan.nextLine());
  }
  
}