// StringBuffer to remove all whitespace characters
import java.util.Scanner;
public class Main{
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 System.out.print("Enter a string: ");
 String str = input.nextLine();
 StringBuffer sb = new StringBuffer(str);
 for (int i = 0; i < sb.length(); i++) {
 if (Character.isWhitespace(sb.charAt(i))) {
 sb.deleteCharAt(i);
 i--;
 }
 }
 System.out.println("New string: " + sb.toString());
 }
}
