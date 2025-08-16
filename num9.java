
package assignments3;
import java.util.Scanner; 
public class num9 { 
public static void main(String[] args) { 
Scanner scan = new Scanner(System.in); 
System.out.print("nhap so nguyen: "); 
int number = scan.nextInt(); 
scan.nextLine();
System.out.print("enter text: "); 
String text = scan.nextLine(); 
System.out.println("Number: " + number); 
System.out.println("Sentence: " + text); 
} 
} 