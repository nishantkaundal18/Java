// Count no. of vowels and consonants in a given String/
import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str=s.nextLine();
        str=str.toLowerCase();
        int i,vc=0,cc=0;
        for(i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
            vc++;
            else if(str.charAt(i)>'a'&&str.charAt(i)<='z')
            cc++;
        }
        System.out.println("\nNo. of Vowels:"+vc);
        System.out.println("No. of Consonants:"+cc);
    }
}