import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 System.out.print("Enter a string: ");
 String str = input.nextLine();
 System.out.print("Enter the character to replace: ");
 char oldChar = input.nextLine().charAt(0);
 System.out.print("Enter the replacement character: ");
 char newChar = input.nextLine().charAt(0);
 StringBuffer sb = new StringBuffer(str);
 for (int i = 0; i < sb.length(); i++) {
 if (sb.charAt(i) == oldChar) {
 sb.setCharAt(i, newChar);
 }
 }
 System.out.println("New string: " + sb.toString());
 }
}
