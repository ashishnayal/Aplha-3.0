// Program to print the number of times appear the number
public class Assignment2 {
    static int countNumber(int arr[][])
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[i][j]==7)
                {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[][]={{4,7,8},{8,8,7}};
        System.out.println("the number of times 7's appear in an array:"+countNumber(arr));

    }
}
