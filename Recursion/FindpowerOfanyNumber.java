// Program to find the power of any number (Stack Height=n)
public class FindpowerOfanyNumber {
    static int calcPower(int x,int n)
    {
        if(n==0)
        {
            return 1;
        }
        if(x==0)
        {
            return 0;
        }
        int calc=x*calcPower(x, n-1);
        return calc;
    }
    public static void main(String[] args) {
        int x=4,n=4;
        int ans=calcPower(x, n);
        System.out.println(ans);
    }
}
