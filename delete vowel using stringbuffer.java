import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		StringBuffer s=new StringBuffer(str);
		for(int i=0;i<s.length();i++)
		{
		    if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
		    {
		        s.deleteCharAt(i);
		        i--;
		    }
		}
		System.out.println("New String is:"+s.toString());
	}
}
