import java.util.Scanner;

class Person
{
  private int age;
  
  public Person(int initialAge)
  {
    if (initialAge < 0)
    {
      this.age = 0;
      System.out.println("Age is not valid, setting age to 0.");
    }
    else
      this.age = initialAge;
  }// end Person - constructor
  
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int     T  = sc.nextInt();
    for (int i = 0; i < T; i++)
    {
      int    age = sc.nextInt();
      Person p   = new Person(age);
      p.amIOld();
      for (int j = 0; j < 3; j++)
           p.yearPasses();
      p.amIOld();
      System.out.println();
    }// end for - i
    sc.close();
  }// end main
  
  public void amIOld()
  {
    if (13 <= this.age && this.age < 18)
    {
      System.out.println("You are a teenager.");
      return;
    }// end if
    
    if (this.age < 13)
    {
      System.out.println("You are young.");
      return;
    }// end if
    
    System.out.println("You are old.");
  }// end amIOld
  
  public void yearPasses()
  {
    this.age++; // Increment this person's age.
  }// end yearPasses
}// end Person - class