package baitap;
import java.util.Scanner;
public class joint {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        int[] arr3 = new int[arr1.length+arr2.length];

        //Sử dụng vòng lặp nhập giá trị cho các phần tử trong mảng

        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Array1: Nhap so thu "+ (i+1)+":");
            Scanner scanner = new Scanner(System.in);
            arr1[i] = scanner.nextInt();
        }

        System.out.println("__________________");

        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Array 2: Nhap so thu "+ (i+1)+":");
            Scanner scanner = new Scanner(System.in);
            arr2[i] = scanner.nextInt();
        }

        // Gan array1 cho array3

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }

        // Gan array2 cho array3

        for (int i = arr2.length, j=0; i < arr3.length; i++,j++) {
            arr3[i] = arr2[j];
        }

        // In ra arr3
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + "\t");
        }
    }
}
