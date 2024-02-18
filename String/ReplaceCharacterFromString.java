// Program to replace an character from the given string
/* 
import java.util.Scanner;
public class String5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any string:");
        String str=sc.nextLine();
        String result="";
         result+=(str.replace('e', 'i'));
        System.out.println("The updated string is:"+result);
    }
}
 */
import java.util.Scanner;
public class ReplaceCharacterFromString{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any String:");
        String str=sc.nextLine();
        String result="";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='e')
            {
                result+='i';
            }
            else
            {
                result+=str.charAt(i);
            }
        }
        System.out.println("The final String is:"+result);
    }
}