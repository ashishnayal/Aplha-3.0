//Program to Insert An Element in Array
public class InsertionInArray {
    static void insertElement(int arr[],int n,int x,int pos)
    {
        for(int i=n-1;i>=pos;i--)
        {
            arr[i+1]=arr[i];
        }
        arr[pos]=x;
    }
    public static void main(String[] args) {
        int arr[]=new int[15];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        int n=5;
        int x=10,pos=2;
        System.out.println("Before Insertion:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
        insertElement(arr, n, x, pos);
        n+=1;
        System.out.println("\n\n after Insertion:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
