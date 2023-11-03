import java.util.Scanner;

public class Work1 {
    public static void main(String[] args) {
        System.out.print("Введите любое число: ");
        Scanner sc = new Scanner(System.in);
        double number = sc.nextDouble();
        if (number > 7) {
            System.out.println("Привет");
        }
    }
}