//reverse character of given string
import java.io.*;
import java.util.Scanner;
class Main
{
    public static void main (String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter string :");
        String str=s.nextLine();
        String rev = "";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        System.out.println("Reversed string :"+rev);
    }
}