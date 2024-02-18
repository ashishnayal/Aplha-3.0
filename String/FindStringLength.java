// Program to find the length of the given array type string
import java.util.Scanner;
public class FindStringLength {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=sc.nextInt();
        String array[]=new String[size];
        int toLength=0;
        System.out.println("enter the element of array:");
        for(int i=0;i<=size;i++)
        {
            array[i]=sc.nextLine();
            toLength+=array[i].length();
        }
        System.out.println("The Length of the given Array is:"+toLength);

    }
}
