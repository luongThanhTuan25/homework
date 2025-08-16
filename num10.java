
package assignments3;

import java.util.Scanner;

public class num10 { 
public static void main(String[] args) { 
    Scanner scan = new Scanner(System.in); 

scan.useDelimiter(","); 
System.out.println("nhap text cach nhau boi dau ',': "); 
while (scan.hasNext()) { 
System.out.println(scan.next()); 
} 
} 
}
