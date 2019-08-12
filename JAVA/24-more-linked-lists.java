import java.util.Scanner;

class MoreLinkedLists
{
  public static void main(String args[])
  {
    Scanner sc   = new Scanner(System.in);
    Node    head = null;
    int     T    = sc.nextInt();
    while (T-- > 0)
    {
      int ele = sc.nextInt();
      head = insert(head, ele);
    }// end while
    head = removeDuplicates(head);
    display(head);
  }// end main
  
  public static Node insert(Node head, int data)
  {
    Node p = new Node(data);
    if (head == null)
      head = p;
    else if (head.next == null)
      head.next = p;
    else
    {
      Node start = head;
      while (start.next != null)
        start = start.next;
      start.next = p;
    }// end if - else
    return head;
  }// end insert
  
  public static Node removeDuplicates(Node head)
  {
    Node tmp = head;
    while (tmp != null && tmp.next != null)
    {
      while (tmp.data == tmp.next.data)
      {
        tmp.next = tmp.next.next; // skip one number
        if (tmp.next == null)
          break;
      }// end if
      tmp = tmp.next;
    }// end while
    
    return head;
  }// end removeDuplicates
  
  public static void display(Node head)
  {
    Node start = head;
    while (start != null)
    {
      System.out.print(start.data + " ");
      start = start.next;
    }// end while
  }// end display
  
  private static class Node
  {
    int  data;
    Node next;
    
    Node(int d)
    {
      data = d;
      next = null;
    }// end Node - constructor
  }// end Node - class
}// end MoreLinkedLists - class