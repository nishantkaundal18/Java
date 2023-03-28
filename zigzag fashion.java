import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int[]arr;
		int len=0;
		System.out.println("Enter the no. of element");
		len=s.nextInt();
		arr=new int[len];
		System.out.println("Enter the elements:");
		for(int i=0;i<len;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("Zigzag array is\n:");
		zigzagArray(arr,len);
		for(int i=0;i<len;i++)
		{
			System.out.println(+arr[i]+" ");
			System.out.print("\n");
		}
	}
	public static void zigzagArray(int arr[],int n)
	{
		for(int i=0;i<n-1;i++)
		{
			if(i%2==0&&arr[i]>arr[i+1])
			{
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
			else if(i%2==1 && arr[i]<arr[i+1])
			{		
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		return;
	}
}
/*WAP to print a given array into zig-zag fashion.Ex.6 2 3 5 7 8  --> sort(2 3 5 6 7 8 ) -->(2 < 6_> 3 < 7_ > 5 < 8_)
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner s=new Scanner(System.in);
		int i,n,t,j;
		System.out.print("Enter array limit : ");
		n=s.nextInt();
		int a[]=new int[n];
		int d[]=new int[n];
		System.out.print("Enter array elements : ");
		for(i=0;i<n;i++)
		{
		    a[i]=s.nextInt();
		}
		for(i=0;i<n;i++)
		{
		  for(j=0;j<n-i-1;j++)
		   {
		     if(a[j]>a[j+1])
		     {
		        t=a[j];
		        a[j]=a[j+1];
		        a[j+1]=t;
		     }
		   }
		}
       for (i = 0; i < a.length - 1; i++) {
            if (i % 2 == 0 && a[i] > a[i+1]) {
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
            } 
            else if (i % 2 == 1 && a[i] < a[i+1]) {
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
            }
        }

        // Print the zig-zag array
        for (i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
		
	}	
}


