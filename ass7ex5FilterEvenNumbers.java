import java.util.ArrayList;
import java.util.Scanner;

public class ass7ex5FilterEvenNumbers {

    // Hàm lọc số chẵn từ mảng
    public static ArrayList<Integer> laySoChan(int[] arr) {
        ArrayList<Integer> dsSoChan = new ArrayList<>();

        for (int so : arr) {
            if (so % 2 == 0) {
                dsSoChan.add(so);
            }
        }

        return dsSoChan;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

   
        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();

        int[] mang = new int[n];

      
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử " + (i + 1) + ": ");
            mang[i] = sc.nextInt();
        }

        
        ArrayList<Integer> ketQua = laySoChan(mang);

        
        System.out.print("Mảng ban đầu: ");
        for (int so : mang) {
            System.out.print(so + " ");
        }

        System.out.println("\nCác số chẵn trong ArrayList: " + ketQua);

        sc.close();
    }
}
