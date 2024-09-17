import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите роль");
        String role = scanner.nextLine();
        if (role.equals("Админ")) {
            System.out.println("Все пользователи");
        } else {
            System.out.print("Привет, Введите свой ник");
            String role1 = scanner.nextLine();
            System.out.println("Привет, " + role1);
        }


    }}