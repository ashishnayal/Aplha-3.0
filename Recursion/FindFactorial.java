//Program to find Factorial of a Number 
public class FindFactorial {
    public static int findFactorial(int n)
    {
        if(n==1)
        {
            return 1;
        }
         int fact=n*findFactorial(n-1);
         return fact;
    }
    public static void main(String[] args) {
         int ans=findFactorial(5);
        System.out.println(ans);
    }
}
