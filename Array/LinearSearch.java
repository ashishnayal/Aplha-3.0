//program to use a Linear Search
public class LinearSearch {
    public static  void linearSearch(int numbers[],int num)
    {
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]==num)
            {
                System.out.println("Numbers founf At index:"+i);
            }
        }
    }
    public static void main(String[] args) {
        int numbers[]={10,20,30,40,50};
        int num=30;
        linearSearch(numbers, num);
    }
    
}
