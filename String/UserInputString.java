// Program of user input String
import java.util.Scanner;
public class UserInputString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=sc.nextLine();
        System.out.println("Enter your full name:");
        String fullName=sc.nextLine();
        System.out.println("your name is:"+name);
        System.out.println("your fullname is:"+fullName);
    }
}
