//String only contains digits
import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
	 
	    Scanner s=new Scanner(System.in);
		System.out.println("Enter the string :");
		String str=s.nextLine();
		int i=0,n,f=0;
		n=str.length();
		for(i=0;i<n;i++)
		{
		    if(!(str.charAt(i)>=49 && str.charAt(i)<=57))
		    {
		        f=1;
		        break;
		    }
		}
		if(f==1)
		    System.out.println("String does not contain only digits");
		else
		    System.out.println("string contain only digits");
	}
}