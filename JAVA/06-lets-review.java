import java.util.Scanner;

class Review
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String  word;
    char[]  letters;
    
    int T = sc.nextInt();
    sc.nextLine();
    
    for (int i = 0; i < T; i++)
    {
      word    = sc.nextLine();
      letters = word.toCharArray();
      
      for (int j = 0; j < letters.length; j++)
        if (j % 2 == 0)
          System.out.print(letters[j]);
      
      System.out.print(" ");
      
      for (int j = 0; j < letters.length; j++)
        if (j % 2 != 0)
          System.out.print(letters[j]);
      System.out.println();
    }// end for - i
    
    sc.close();
  }// end main
}// end Review - class