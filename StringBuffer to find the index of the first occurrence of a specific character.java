 //StringBuffer to find the index of the first occurrence of a specific character
import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 System.out.print("Enter a string: ");
 String str = input.nextLine();
 System.out.print("Enter the character to find: ");
 char ch = input.nextLine().charAt(0);
 StringBuffer sb = new StringBuffer(str);
 int index = sb.indexOf(String.valueOf(ch));
 if (index == -1) {
 System.out.println("The character '" + ch + "' is not found in the 
string.");
 } else {
 System.out.println("The index of the first occurrence of '" + ch + "' is: 
" + index);
 }
 }
}