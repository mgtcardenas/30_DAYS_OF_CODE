import java.util.Scanner;

class NestedLogic
{
  public static void main(String[] args)
  {
    Scanner sc            = new Scanner(System.in);
    int     actualDay     = sc.nextInt();
    int     actualMonth   = sc.nextInt();
    int     actualYear    = sc.nextInt();
    int     expectedDay   = sc.nextInt();
    int     expectedMonth = sc.nextInt();
    int     expectedYear  = sc.nextInt();
    int     fine          = 0;
    
    if (actualDay > expectedDay && actualMonth == expectedMonth && actualYear == expectedYear)
      fine = 15 * (actualDay - expectedDay);
    
    if (actualMonth > expectedMonth && actualYear == expectedYear)
      fine = 500 * (actualMonth - expectedMonth);
    
    if (actualYear > expectedYear)
      fine = 10000;
    
    System.out.println(fine);
  }// end main
}// end NestedLogic - class