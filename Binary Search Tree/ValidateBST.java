// Program to check the BST is Validate or Not
public class ValidateBST {
    public class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static boolean isvalidBST(Node root,Node min,Node max){
        if(root==null)
        {
            return true;
        }
        if(min!=null&&root.data<=min.data)
        {
            return false;
        }
        else if(max!=null&&root.data>=max.data)
        {
            return false;
        }
        return (isvalidBST(root, min, root)&&isvalidBST(root, root, max));
    }
    public static void main(String[] args) {
        int values[]={8,5,3,6,10,11,14};
        if(isvalidBST(null, null, null))
        {
            System.out.println("valid");
        }else{
            System.out.println("Not valid");
        }
    }
}
