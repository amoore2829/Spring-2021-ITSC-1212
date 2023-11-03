public class ZeroCases {
  int x = 17;
  switch (x) {
    case 0:
      System.out.println("Zero");
      break;
    case 1:
    case 3:
    case 5:
    case 7:
    case 11:
    case 13:
    case 17:
    case 19:
      System.out.println("Prime");
      break;
    default:
      System.out.println("Not prime");
  }
}