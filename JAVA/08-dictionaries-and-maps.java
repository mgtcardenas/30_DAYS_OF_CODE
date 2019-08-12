import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class DictionariesAndMaps
{
  public static void main(String[] argh)
  {
    Map<String, Integer> book = new HashMap<>();
    Scanner              in   = new Scanner(System.in);
    int                  n    = in.nextInt();
    
    for (int i = 0; i < n; i++)
    {
      String name  = in.next();
      int    phone = in.nextInt();
      book.put(name, phone);
    }// end for - i
    
    while (in.hasNext())
    {
      String s = in.next();
      if (book.containsKey(s))
        System.out.println(s + "=" + book.get(s));
      else
        System.out.println("Not found");
    }// end while
    
    in.close();
  }// end main
}// end DictionariesAndMAps - class