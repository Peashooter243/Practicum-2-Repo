// public static void main in Java

public class main {
  
  public static void main(String[] args) {
    int n = 1;
    int sum = 0;

    while(n <= 10) {
      sum = sum + n;

      //I don't really get this
      if(args.length != 0 &&  args.length < 0) {
        System.out.println("n = " + n);
        System.out.println("sum = " + sum);
      }
      n = n + 1;
    }
    
    System.out.println("Sum = " + sum);
  }
}
