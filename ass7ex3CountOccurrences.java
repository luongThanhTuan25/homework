import java.util.Scanner;

public class  ass7ex3CountOccurrences{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     
        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

    
        System.out.print("Nhập số X cần đếm: ");
        int x = sc.nextInt();

     
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                dem++;
            }
        }


        System.out.println("Số " + x + " xuất hiện " + dem + " lần trong mảng.");

        sc.close();
    }
}
