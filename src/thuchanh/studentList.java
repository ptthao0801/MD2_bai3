package thuchanh;
import java.util.Scanner;

public class studentList {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
       // Tạo biến chứa tên tim kiem nhap vao
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a student's name: ");
        String input_name = scanner.nextLine();

        // Duyet mang, tim phan tu = gia tri nhap vao
        boolean isExist = false;
        for (int i=0; i<students.length;i++){
            if (students[i].equals(input_name)){
                System.out.println("The position of student " + input_name + "  in the list is: " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist){
            System.out.println("Not found " + input_name + " in the list.");
        }
    }
}
