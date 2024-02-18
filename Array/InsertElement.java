//Program to  Search operation in sorted array
public class InsertElement {
    public static int findElement(int arr[],int n,int key)
    {
        for(int i=0;i<n;i++)
        {
            if(arr[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={12,24,10,8,23};
        int n=arr.length;
        int key=23;
        int postion=findElement(arr,n,key);
        if(postion==-1)
        {
            System.out.println("Element not found");
        
        }else{
            System.out.println("Element found at position:"+(postion+1));
        }
    }
}
