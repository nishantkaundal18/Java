import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the integer");
	    int n=s.nextInt();
	    String str=Integer.toString(n);
	    int len=str.length();
	    String str1="";
	    for(int i=0;i<len;i++)
	    {
	    	if(str.charAt(i)=='0')
	    	{
	    		str1+='1';
	    	}
	    	else
	    	{
	    		str1+=str.charAt(i);
	    	}
	    }
	    System.out.println("Number is"+str1);
	    s.close();
	 }
}