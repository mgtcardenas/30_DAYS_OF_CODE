import java.util.Scanner;

class BidimensionalArrays
{
  private static final Scanner scanner = new Scanner(System.in);
  
  public static void main(String[] args)
  {
    int[][] arr = new int[6][6];
    int     a, b, c, d, e, f, g, max, tmp;
    
    max = Integer.MIN_VALUE;
    
    for (int i = 0; i < 6; i++)
    {
      String[] arrRowItems = scanner.nextLine().split(" ");
      scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
      
      for (int j = 0; j < 6; j++)
      {
        int arrItem = Integer.parseInt(arrRowItems[j]);
        arr[i][j] = arrItem;
      }// end for - j
    }// end for - i
    
    for (int i = 0; i < 4; i++)
      for (int j = 0; j < 4; j++)
      {
        a = arr[i][j];
        b = arr[i][j + 1];
        c = arr[i][j + 2];
        d = arr[i + 1][j + 1];
        e = arr[i + 2][j];
        f = arr[i + 2][j + 1];
        g = arr[i + 2][j + 2];
        
        tmp = a + b + c + d + e + f + g;
        
        if (tmp > max)
          max = tmp;
      }// end for - j
    
    System.out.println(max);
    
    scanner.close();
  }// end main
}// end BidimensionalArrays - class