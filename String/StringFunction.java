// program of the String Function
public class StringFunction {
    public static void main(String[] args) {
        //concatenation
       /*  String firstName="Ashish";
        String lastName="Nayal";
        String fullName=firstName+" "+lastName;
        System.out.println(fullName); 
        //Length
        System.out.println(fullName.length()); */
        //compareTo method
        /* 
        String name1="Ashish";
        String name2="Ashish";
        //s1>s2:+ve value
        //s1==s2:0
        //s1<s2:-ve value
        if(name1.compareTo(name2)==0)
        {
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
        */
        //substring method
        /* 
        String sentence="my name is Ashish";
        //subString( beg index,end index)
        String name=sentence.substring(11,sentence.length());
        System.out.println(name);
        */
        /* 
        String sentence="TonyStark";
        String name=sentence.substring(4);
        System.out.println(name);
        */
        //parseInt method
        /* 
        String str="123";
        int number=Integer.parseInt(str);
        System.out.println(number);
        */
        // toString method
        int number=123;
        String str=Integer.toString(number);
        System.out.println(str.length());
    }
}
 