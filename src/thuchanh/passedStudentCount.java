package thuchanh;
import java.util.Scanner;
public class passedStudentCount {
    public static void main(String[] args) {
        // Nhap size sinh vien
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien: ");
        size = scanner.nextInt();

        // Tao danh sach sinh vien
        int[] list = new int[size];

        // Nhap diem cua cac sinh vien
        for (int i = 0; i < list.length; i++) {
            System.out.print("Nhap diem cua sinh vien "+(i+1)+": ");
            list[i] = scanner.nextInt();
        }

        // Dem so luong sinh vien da do
        int count =0;
        for (int i = 0; i < list.length; i++) {
            if (list[i]>=5){count++;}
        }

        // In so luong sinh vien da do
        System.out.println("So luong sinh vien da do la "+count);
    }
}
