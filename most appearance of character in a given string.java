//most appearance of character in a given string
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String:");
        String str=s.nextLine();
        int[] freq=new int[str.length()];
        char maxchar=str.charAt(0);
        int i,j,max;
        char string[]=str.toCharArray();
        for(i=0;i<string.length;i++)
        {
            freq[i]=1;
            for(j=i+1;j<string.length;j++)
            {
                if(string[i]==string[j]&&string[i]!=' '&&string[i]!='0')
                freq[i]++;
                string[j]='0';
            }
        }
        max=freq[0];
        for(i=0;i<freq.length;i++)
        {
            if(max<freq[i])
            {
                max=freq[i];
                maxchar=string[i];
            }
        }     
        System.out.print("Maximum ocurring character: "+maxchar);
    }
}