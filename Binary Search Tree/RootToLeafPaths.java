import java.util.*;
public class RootToLeafPaths {
    public class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static void printroot2leaf(Node root,ArrayList <Integer> path)
    {
        if(root==null)
        {
            return;
        }
        path.add(root.data);
        if(root.left==null && root.right==null)
        {
            printPath(path);
        }
        printroot2leaf(root.left, path);
        printroot2leaf(root.right, path);
        path.remove(path.size()-1);
    }
    public static void printPath(ArrayList<Integer> path)
    {
        for(int i=0;i<path.size();i++)
        {
            System.out.println(path.get(i)+"->");
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        int values[]={8,5,3,1,4,6,10,11,14};
        printroot2leaf(null,new ArrayList<>());
    }
}
