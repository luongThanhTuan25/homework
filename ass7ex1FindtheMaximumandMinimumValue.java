package lec7array;

import java.util.Scanner;

public class ass7ex1FindtheMaximumandMinimumValue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("leght of num: ");
        int num = sc.nextInt();
        int[] number = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.println("num" + (i+1) + ":");
            number[i] = sc.nextInt();
        }
        double max = number[0];
        double min = number[0];
        for (int i = 1; i < num; i++) {
            if(number[i]>max){
                max=number[i];
            }
        }
        for (int j=1;j<num;j++){
            if(number[j]< min){
                min=number[j];
            }
        }
        System.out.println("max  "+max);
        System.out.println("min  "+min);
    }
}
