import java.util.LinkedList;
import java.util.Scanner;

class BSTLevelOrderTraversal
{
  static void levelOrder(Node root)
  {
    LinkedList<Node> queue = new LinkedList<>();
    if (root != null)
    {
      queue.add(root);
      while (!queue.isEmpty())
      {
        Node tree = queue.poll();
        System.out.print(tree.data + " ");
        
        if (tree.left != null)
          queue.addLast(tree.left);
        
        if (tree.right != null)
          queue.addLast(tree.right);
      }// end while
    }// end if
  }// end levelOrder
  
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
      }// end if - else
      return root;
    }// end if - else
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
    levelOrder(root);
  }// end main
  
  private static class Node
  {
    Node left, right;
    int data;
    
    Node(int data)
    {
      this.data = data;
      left      = right = null;
    }// end Node - constructor
  }// end Node
}// end BSTLevelOrderTraversal - class