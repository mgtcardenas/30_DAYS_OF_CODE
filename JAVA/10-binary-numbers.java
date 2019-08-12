import java.util.Scanner;

class BinaryNumbers
{
  private static final Scanner scanner = new Scanner(System.in);
  
  public static void main(String[] args)
  {
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
    int    n               = scanner.nextInt();
    char[] binary          = Integer.toBinaryString(n).toCharArray();
    int    maxConsecutives = 0;
    int    counter         = 0;
    
    for (int i = 0; i < binary.length; i++)
      if (binary[i] == '1')
        counter++;
      else
      {
        //end if
        if (counter > maxConsecutives)
          maxConsecutives = counter;
        counter = 0;
      }// end if-else
    
    if (counter > maxConsecutives)
      maxConsecutives = counter;
    
    System.out.println(maxConsecutives);
    scanner.close();
  }// end main
}// end BinaryNumbers - class