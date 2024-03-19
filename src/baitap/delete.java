package baitap;
import java.util.Scanner;
public class delete {
    public static int find(int[] list, int x){
        // Tim x trong list
        int index = 0;
        for (int i=0; i< list.length; i++){
            if (list[i]==x){
                index = i;
            }
        }
        return index;
    }
//    public static int delete(int[] list, int del_index){
        // Xoa x trong list

//    }
    public static void main(String[] args) {
        // Nhap X la phan tu can xoa
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap phan tu can xoa:");
        int x = scanner.nextInt();

        int[] arr = {10,4,6,7,8,6,0,0,0,0};

        // Tao mang moi (tru di 1 phan tu da xoa)
        int[] newArr = new int[arr.length-1];

        for (int i=0; i<newArr.length; i++){
//            System.out.println(arr[i]);
            if (i>=find(arr,x)){
                newArr[i] = arr[i+1];
            }
            else {
                newArr[i] = arr[i];
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]+"\t");
        }
    }
}
