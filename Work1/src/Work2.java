import java.util.Scanner;

public class Work2 {
    public static void main(String[] args) {

        System.out.print("Введите любое имя с большой буквы: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        if (name.equals("Вячеслав")) {
            System.out.println("Привет, " + name);
        } else {
            System.out.println("Нет такого имени");
        }
    }
}
