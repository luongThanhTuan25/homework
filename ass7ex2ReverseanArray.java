package lec7array;

import java.util.Scanner;

public class ass7ex2ReverseanArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Length of array: ");
        int num = sc.nextInt();

        int[] a = new int[num];

        // Nhập mảng
        for (int i = 0; i < num; i++) {
            System.out.print("num " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }

        // Đảo ngược mảng tại chỗ
        for (int i = 0; i < num / 2; i++) {
            int temp = a[i];
            a[i] = a[num - 1 - i];
            a[num - 1 - i] = temp;
        }

        // In mảng sau khi đảo
        System.out.println("Array after reversal:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
