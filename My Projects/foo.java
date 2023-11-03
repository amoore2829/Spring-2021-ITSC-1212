public class foo
{
  public static void main(String[] args) {
 double foo(int x);
    double out = x/2 + 1;
    if(out < x*3){
        x++;
        out--;
    }
    return out;
}

public static void bar(){
    int x = 3;
    int val = 9;
    double y;
    val = (int) foo(x);
    y = foo(val);
    System.out.print("x has value ");
    System.out.println(x);
}
}