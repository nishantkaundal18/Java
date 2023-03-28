//remove all whites space from a given String/
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str=s.nextLine();
        str=str.replaceAll("\\s","");
        System.out.println(str);
    }
}