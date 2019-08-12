import java.util.Scanner;

class RunningTimeAndComplexity
{
  public static void main(String[] args)
  {
    Scanner sc     = new Scanner(System.in);
    int     T      = sc.nextInt();
    int     n      = 0;
    int     sqrt   = 0;
    boolean failed = false;
    
    while (T-- > 0)
    {
      n = sc.nextInt();
      
      if (n == 1)
      {
        System.out.println("Not prime");
        continue;
      }// end if
      
      if (n == 2)
      {
        System.out.println("Prime");
        continue;
      }// end if
      
      if (n % 2 == 0)
      {
        System.out.println("Not prime");
      }
      else
      {
        sqrt = (int) Math.ceil(Math.sqrt(n));
        for (int i = 3; i <= sqrt; i += 2)
        {
          if (n % i == 0)
          {
            failed = true;
            break;
          }// end if
        }// end for - i
        
        System.out.println(failed ? "Not prime" : "Prime");
        failed = false;
      }// end if - else
    }// end while
  }// end main
}// end RunningTimeAndComplexity - class