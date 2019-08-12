import java.util.Scanner;

class Recursion
{
  private static final Scanner scanner = new Scanner(System.in);
  
  static int factorial(int n)
  {
    return n == 1 ? 1 : n * factorial(n - 1);
  }// end factorial
  
  public static void main(String[] args)
  {
    int n = scanner.nextInt();
    System.out.println(factorial(n));
    scanner.close();
  }// end main
}// end Recursion - class