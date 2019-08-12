import java.util.Scanner;

class Inheritance
{
  public static void main(String[] args)
  {
    Scanner scan       = new Scanner(System.in);
    String  firstName  = scan.next();
    String  lastName   = scan.next();
    int     id         = scan.nextInt();
    int     numScores  = scan.nextInt();
    int[]   testScores = new int[numScores];
    for (int i = 0; i < numScores; i++)
      testScores[i] = scan.nextInt();
    scan.close();
    
    Student s = new Student(firstName, lastName, id, testScores);
    s.printPerson();
    System.out.println("Grade: " + s.calculate());
  }// end main
  
  private static class Person
  {
    protected String firstName;
    protected String lastName;
    protected int    idNumber;
    
    Person(String firstName, String lastName, int identification)
    {
      this.firstName = firstName;
      this.lastName  = lastName;
      this.idNumber  = identification;
    }// end Person - Constructor
    
    public void printPerson()
    {
      System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
    }// end printPerson
  }// end Person - class
  
  private static class Student extends Person
  {
    private int[] testScores;
    
    /**
     * Class Constructor
     *
     * @param firstName - A string denoting the Person's first name.
     * @param lastName  - A string denoting the Person's last name.
     * @param id        - An integer denoting the Person's ID number.
     * @param scores    - An array of integers denoting the Person's test scores.
     */
    public Student(String firstName, String lastName, int id, int[] scores)
    {
      super(firstName, lastName, id);
      this.testScores = scores;
    }// end Student - constructor
    
    /**
     * Method Name: calculate
     *
     * @return A character denoting the grade.
     */
    public char calculate()
    {
      int average = 0;
      
      for (int i : this.testScores)
        average += i;
      
      average = average / this.testScores.length;
      
      if (90 <= average && average <= 100)
        return 'O';
      else if (80 <= average && average < 90)
        return 'E';
      else if (70 <= average && average < 80)
        return 'A';
      else if (55 <= average && average < 70)
        return 'P';
      else if (40 <= average && average < 55)
        return 'D';
      
      return 'T';
    }// end calculate
  }// end Student - class
}// end Inheritance - class