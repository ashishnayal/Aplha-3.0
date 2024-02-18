// Program to print 5 To 1 by recursion
public class Print5To1 {
    public static void printNumber(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        printNumber(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        printNumber(n);
    }
}
