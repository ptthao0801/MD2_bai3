package thuchanh;
import java.util.Scanner;
public class findingMax {
    public static void main(String[] args) {
        int size;
        int[]array;
        // Nhap kich thuoc mang:
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size: ");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size should not exceed 20");
        } while (size > 20);

        // Nhap gia tri cac phan tu cua mang:
        array = new int[size];
        for (int i=0; i<array.length;i++){
            System.out.println("Nhap phan tu thu " + (i+1) + " :");
            array[i] = scanner.nextInt();
        }

        // In ra danh sách tài sản đã nhập
        System.out.println("Property list: ");
        for (int j=0; j<array.length;j++){
            System.out.print(array[j] + "\t");
        }

        // Duyệt các phần tử trong mảng để tìm GTLN và vị trí
        int max = array[0];
        int index = 0;
        for (int k=0; k<array.length;k++){
            if (array[k] > max){
                max = array[k];
                index = k + 1;
            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);
    }
}
