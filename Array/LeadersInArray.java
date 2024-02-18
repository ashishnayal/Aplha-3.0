// Program to Leaders in an Array
public class LeadersInArray {
    public static void printLeaders(int arr[],int size){
        for(int i=0;i<size;i++)
        {
            int j;
            for(j=i+1;j<size;j++){
                if(arr[i]<=arr[j]){
                    break;
                }
            }
            if(j==size){
                System.out.println(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={16,17,4,3,5,2};
        int n=arr.length;
        printLeaders(arr,n);
    }
}
