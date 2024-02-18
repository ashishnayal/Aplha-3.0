// Program to print the sum of the second rows of the given array
public class Assignment3 {
    static int sumOfSecondRow(int arr[][])
    {
        int sum=0;
        for(int j=0;j<arr[0].length;j++)
        {
            sum+=arr[2][j];
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[][]={{1,4,9},{11,4,3},{2,2,3}};
        System.out.println("The sum of the second row of an given array is:"+sumOfSecondRow(arr));
    }
}
