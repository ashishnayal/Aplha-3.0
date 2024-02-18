//Program to take an array of names from user and print them
import java.util.Scanner;
public class UserInputArray {
    public static void printArrayOfNames(String numbers[]){
     for(int i=0;i<numbers.length;i++)
        {
             System.out.println(numbers[i]+" ");
         }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter thge size of array:");
        int size=sc.nextInt();
        String numbers[]=new String[size];
        for(int i=0;i<numbers.length;i++)
        {
            numbers[i]=sc.nextLine();
        }
        printArrayOfNames(numbers); 
    }

}

