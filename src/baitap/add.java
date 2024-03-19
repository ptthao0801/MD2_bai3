package baitap;
import java.util.Scanner;
public class add {
    public static void main(String[] args) {
        int arr[] = {10,4,6,7,8};
        int newArr[] = new int[arr.length +1];

        //Nhap X là so can chen
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so can chen:");
        int x = scanner.nextInt();

        //Nhập vào vị trí index cần chèn X vào trong mảng
        System.out.println("Nhap vi tri index can chen:");
        int index = scanner.nextInt();

        // WARNING
        if (index<0 || index>(arr.length-1)){
            System.out.println("Khong ton tai index!");
        }

        // sao chep Mang Arr sang newArr
        for (int i = 0; i < newArr.length; i++) {
            if (i<index){
                newArr[i] = arr[i];
            } else if (i==index) {
                newArr[i] = x;
            } else {newArr[i] = arr[i-1];}
        }


        // In ra mang moi newArray[]
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + "\t");
        }
    }
}
