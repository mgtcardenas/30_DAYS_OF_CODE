import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

class RegExp
{
  private static final Scanner scanner = new Scanner(System.in);
  
  public static void main(String[] args)
  {
    LinkedList<String> names = new LinkedList<>();
    int                N     = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
    for (int NItr = 0; NItr < N; NItr++)
    {
      String[] firstNameEmailID = scanner.nextLine().split("\\s[a-zA-Z.]*");
      String   firstName        = firstNameEmailID[0];
      String   emailID          = firstNameEmailID[1];
      
      if (emailID.equals("@gmail.com"))
        names.add(firstName);
    }// end for - NItr
    
    Collections.sort(names);
    
    for (String s : names)
      System.out.println(s);
    
    scanner.close();
  }// end main
}// end RegExp - class