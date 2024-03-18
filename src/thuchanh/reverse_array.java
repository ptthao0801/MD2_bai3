package thuchanh;
import java.util.Scanner;

public class reverse_array {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size: ");
            size = scanner.nextInt();
            if (size >20){
                System.out.println("Size does not exceed 20");
            }
        } while (size > 20);
        array = new int[size];
        for (int i = 0; i<array.length;i++){
            System.out.println("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
// Sử dụng biến trung gian để hoán đổi giá trị giữa 2 phần tử.
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
// In ra mảng sau khi đã đảo ngược thứ tự các phần tử
        System.out.printf("\n%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
