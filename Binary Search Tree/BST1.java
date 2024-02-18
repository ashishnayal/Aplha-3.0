// Search a BST
public class BST1 {
    
    public class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static boolean search(Node root,int key)
    {
        if(root==null)
        {
            return false;
        }
        if(root.data==key){
            return true;
        }
        if(root.data>key){
            return search(root.left,key);
        }else{
            return search(root.right,key);
        }
    }
   
    public static void main(String[] args) {
        int values[]={5,1,3,4,2,7};

        Node root=null;
        if(search(root,1)){
            System.out.print("found");
        }else{
            System.out.println("Not found");
        }
    }
}
