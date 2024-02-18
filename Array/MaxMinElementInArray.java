// Program to find Maximum and Minimum
import java.util.Scanner;
public class MaxMinElementInArray {
    public static void findMaxMin(int arr[],int size)
    {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<size;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("Largest Number is:"+max);
        System.out.println("Smallest Number is:"+min);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  the size of an Array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter any elements:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        findMaxMin(arr,size);
    }
}
