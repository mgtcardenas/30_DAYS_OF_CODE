import java.util.Scanner;

class BST
{
  public static int getHeight(Node root)
  {
    if (root == null)
      return -1;
    else
    {
      int rightHeight = getHeight(root.right);
      int leftHeight  = getHeight(root.left);
      
      return rightHeight > leftHeight ? rightHeight + 1 : leftHeight + 1;
    }// end if - else
  }// end getHeight
  
  public static Node insert(Node root, int data)
  {
    if (root == null)
      return new Node(data);
    else
    {
      Node cur;
      if (data <= root.data)
      {
        cur       = insert(root.left, data);
        root.left = cur;
      }
      else
      {
        cur        = insert(root.right, data);
        root.right = cur;
      }// end if-else
      
      return root;
    }// end if-else
  }// end insert
  
  public static void main(String args[])
  {
    Scanner sc   = new Scanner(System.in);
    int     T    = sc.nextInt();
    Node    root = null;
    while (T-- > 0)
    {
      int data = sc.nextInt();
      root = insert(root, data);
    }// end while
    int height = getHeight(root);
    System.out.println(height);
  }// end main
  
  private static class Node
  {
    Node left, right;
    int data;
    
    Node(int data)
    {
      this.data = data;
      left      = right = null;
    }// end Node
  }// end Node - class
}// end BST - class