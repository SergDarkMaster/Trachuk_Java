import java.util.Scanner;

public class Work3 {
    public static void main(String[] args) {

        System.out.println("Укажите, какое количество целых чисел Вы хотите сравнить: ");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] array = new int[length];
        System.out.println("Введите эти числа: ");
        for (int i = 0; i < length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Введенные Вами числа, кратные '3': ");

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                System.out.println(array[i]);
            }
        }
    }
}
