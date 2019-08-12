import java.util.Scanner;

class BitwiseAnd
{
  private static final Scanner scanner = new Scanner(System.in);
  
  public static void main(String[] args)
  {
    int aAndB = 0;
    int t     = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
    
    for (int tItr = 0; tItr < t; tItr++)
    {
      String[] nk = scanner.nextLine().split(" ");
      int      n  = Integer.parseInt(nk[0]);
      int      k  = Integer.parseInt(nk[1]);
      
      for (int a = 1; a < n; a++)
        for (int b = a + 1; b <= n; b++)
          if ((a & b) < k && aAndB < (a & b))
            aAndB = a & b;
      
      System.out.println(aAndB);
      aAndB = 0;
    }// end for - tItr
    
    scanner.close();
  }// end main
}// end BitwiseAnd - class