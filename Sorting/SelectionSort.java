//program to sort the array using selection sort
public class SelectionSort {
    /**
     * @param arr
     */
    public static void printArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
        public static void main(String args[]) {
            int arr[]={7,8,1,3,2};
            for(int i=0;i<arr.length-1;i++)
            {
                int smallest =i;
                for(int j=i+1;j<arr.length;j++)
                {
                    if(arr[j]<arr[smallest])
                    {
                        smallest=j;
                    }
                }
                int temp=arr[smallest];
                arr[smallest]=arr[i];
                arr[i]=temp;
            }
            printArray(arr);
        }
    
}
