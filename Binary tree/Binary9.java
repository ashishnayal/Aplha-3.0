import java.util.*;
class Binary9
{
    static class Node
    {
        int data;
        Node left;
        Node right;
       public  Node(int data)
        {
        this.data=data;
        this.left=null;
        this.right =null;
        }
    }
    static boolean univaluedOrNot(Node root)
    {
        if(root==null)
        {
            return true;
        }
        if(root.data!=root.left.data && root.left!=null)
        {
            return false;
        }
        if(root.right!=null && root.right.data!=root.data)
        {
            return false;
        }
        return univaluedOrNot(root.left)|| univaluedOrNot(root.right);
    }
    
    public static void main(String[] args) {
        
    }
}