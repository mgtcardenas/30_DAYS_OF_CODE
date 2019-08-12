import java.util.Scanner;

class LinkedLists
{
  public static void main(String args[])
  {
    Scanner sc   = new Scanner(System.in);
    Node    head = null;
    int     N    = sc.nextInt();
    
    while (N-- > 0)
    {
      int ele = sc.nextInt();
      head = insert(head, ele);
    }// end while
    
    display(head);
    sc.close();
  }// end main
  
  public static Node insert(Node head, int data)
  {
    if (head == null)
    {
      head = new Node(data);
      return head;
    }// end if
    
    Node tmp = head;
    while (tmp.next != null)
      tmp = tmp.next;
    
    tmp.next = new Node(data);
    return head;
  }// end insert
  
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
}// end LinkedLists - class