public class ProgramToPrintNumber{
    // Program to print 5 To 1 by recursion
    public static void printNumber(int n)
    {
        if(n==6)
        {
            return;
        }
        System.out.println(n);
        printNumber(n+1);
    }
    public static void main(String[] args) {
        int n=1;
        printNumber(n);
    }
}

