// Program of String is palindrome or Not.
public class ProgramOfpalindrome {
    public static boolean isPalindrome(String str1){
        for(int i=0;i<str1.length()/2;i++)
        {
            int n=str1.length();
            if(str1.charAt(i)!=str1.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str1="rar";
        System.out.println(isPalindrome(str1));
    }
}
