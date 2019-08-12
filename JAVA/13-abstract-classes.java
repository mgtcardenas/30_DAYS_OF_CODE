import java.util.Scanner;

class AbstractClasses
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    String  title   = scanner.nextLine();
    String  author  = scanner.nextLine();
    int     price   = scanner.nextInt();
    Book    book    = new MyBook(title, author, price);
    book.display();
    scanner.close();
  }// end main
  
  private static abstract class Book
  {
    String title;
    String author;
    
    Book(String title, String author)
    {
      this.title  = title;
      this.author = author;
    }// end Book - Constructor
    
    abstract void display();
  }// end Book - abstract class
  
  private static class MyBook extends Book
  {
    int price;
    
    /**
     * Class Constructor
     *
     * @param title  - The book's title.
     * @param author - The book's author.
     * @param price  - The book's price.
     **/
    public MyBook(String title, String author, int price)
    {
      super(title, author);
      this.price = price;
    }// end MyBook - Constructor
    
    /**
     * Print the title, author, and price in the specified format.
     */
    @Override
    void display()
    {
      System.out.println("Title: " + this.title);
      System.out.println("Author: " + this.author);
      System.out.println("Price: " + this.price);
    }// end display
  }// end MyBook - class
}// end AbstractClasses - class