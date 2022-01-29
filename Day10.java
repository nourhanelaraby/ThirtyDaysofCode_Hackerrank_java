//https://www.geeksforgeeks.org/split-string-java-examples/?ref=leftbar-rightbar
//https://www.tutorialspoint.com/find-maximum-element-of-arraylist-with-java-collections
//https://www.geeksforgeeks.org/integer-tostring-in-java/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Day10
{
    public static void main(String[] args) throws IOException
    {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        StringBuilder str= new StringBuilder();
        int rem;
        while (n>0)
        {
            rem=n%2;
            n=n/2;
            str.append(rem);
        }
        //There is no need for reverse here we aren't displaying no in binary
        String[] arr=str.toString().split("0");
        int max=0;
        for (String sr:arr)
        {
            if(max<sr.length())
                 {
                     max=sr.length();
                 }

        }


        bufferedReader.close();
        System.out.println("String =  " + str.reverse().toString());
        System.out.println("array  =  "+ Arrays.toString(arr));
        System.out.println(max);
       
    }
}
