// Program  to create an array using using user input 
import java.util.Scanner;
public class CreateArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size  of Array.");
        int size=sc.nextInt();
        int marks[]=new int[size];
        for(int i=0;i<marks.length;i++)
        {
            marks[i]=sc.nextInt();
        }
        for(int i=0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }
    }
}
