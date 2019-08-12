import java.util.LinkedList;
import java.util.Scanner;

class QueuesAndStacks
{
  private LinkedList<Character> stack = new LinkedList<>();
  private LinkedList<Character> queue = new LinkedList<>();
  
  public static void main(String[] args)
  {
    Scanner scan  = new Scanner(System.in);
    String  input = scan.nextLine();
    scan.close();
    
    // Convert input String to an array of characters:
    char[] s = input.toCharArray();
    
    // Create a QueuesAndStacks object:
    QueuesAndStacks p = new QueuesAndStacks();
    
    // Enqueue/Push all chars to their respective data structures:
    for (char c : s)
    {
      p.pushCharacter(c);
      p.enqueueCharacter(c);
    }// end for
    
    // Pop/Dequeue the chars at the head of both data structures and compare them:
    boolean isPalindrome = true;
    for (int i = 0; i < s.length / 2; i++)
      if (p.popCharacter() != p.dequeueCharacter())
      {
        isPalindrome = false;
        break;
      }// end if
    
    // Finally, print whether string s is palindrome or not.
    System.out.println("The word, " + input + ", is " + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
  }// end main
  
  private void pushCharacter(char ch)
  {
    stack.add(ch);
  }// end pushCharacter
  
  private void enqueueCharacter(char ch)
  {
    queue.add(ch);
  }// end enqueueCharacter
  
  private char popCharacter()
  {
    return stack.removeLast();
  }// end popCharacter
  
  private char dequeueCharacter()
  {
    return queue.removeFirst();
  }// end dequeueCharacter
}// end QueuesAndStacks - class