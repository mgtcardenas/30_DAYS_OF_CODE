import java.util.Scanner;

class MoreExceptions
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int     t  = in.nextInt();
    while (t-- > 0)
    {
      int        n            = in.nextInt();
      int        p            = in.nextInt();
      Calculator myCalculator = new Calculator();
      try
      {
        int ans = myCalculator.power(n, p);
        System.out.println(ans);
      }
      catch (Exception e)
      {
        System.out.println(e.getMessage());
      }// end try - catch
    }// end while
    
    in.close();
  }// end main
  
  private static class Calculator
  {
    public int power(int n, int p) throws Exception
    {
      if (n < 0 || p < 0)
        throw new Exception("n and p should be non-negative");
      
      int answer = 1;
      
      for (int i = 0; i < p; i++)
        answer *= n;
      
      return answer;
    }// end power
  }// end Calculator - class
}// end MoreExceptions - class