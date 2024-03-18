package thuchanh;
import java.util.Scanner;

public class chuyendoinhietdo {
    public static double CtoF(double celsius){
        double fah = (9.0 / 5) * celsius + 32;
        return fah;
    }
    public static double FtoC(double fah) {
        double celsius = (5.0 / 9) * (fah - 32);
        return celsius;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu.");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();

    // match choice voi menu:
        switch (choice) {
            case 1:
                System.out.println("Input Fah:");
                double inputFah = scanner.nextDouble();
                System.out.println("Fahrenheit to Celsius: " +FtoC(inputFah));
                break;
            case 2:
                System.out.println("Input Cel:");
                double inputCel = scanner.nextDouble();
                System.out.println("Celsius to Fahrenheit: " +CtoF(inputCel));
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("NOT FOUND!");
        }
    }
}
