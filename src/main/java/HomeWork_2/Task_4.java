package HomeWork_2;

//    Задание 4. Разработайте программу, которая выбросит Exception, когда пользователь вводит
//    пустую строку. Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

import java.util.Scanner;

public class Task_4 {

//    public static void main(String[] args) {
//        emptyString();
//    }

    public static void emptyString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String string = scanner.nextLine();

        try {
            if (string.isEmpty()) {
                throw new Exception("Пустые строки вводить нельзя!");
            } else {
                System.out.println("Введенные данные пользователя: " + string);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            emptyString();
        }
    }
}
