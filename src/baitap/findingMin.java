package baitap;
import java.util.Scanner;
public class findingMin {
    public static void main(String[] args) {
        int[] arr = new int[3];

        // Nhap vao cac phan tu cua mang
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhap phan tu thu "+(i+1) +" cua mang: ");
            arr[i] = scanner.nextInt();
        }

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min>arr[i]){min=arr[i];}
        }
        System.out.println("Min cua mang la "+min);
    }
}
