package HomeWork_2;

import java.util.Scanner;

// Задание 1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа
// (типа float), и возвращает введенное значение. Ввод текста вместо числа не должно
// приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя
// ввод данных.

public class Task_1 {

//    public static void main(String[] args) {
//        getNumberUser();
//    }

    public static float getNumberUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дробное число: ");
        String numb = scanner.nextLine();
        try {
            float number = Float.parseFloat(numb);
            System.out.println("Введенное число: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка ввода! Введите дробное число:");
            getNumberUser();
        }
        float number = scanner.nextFloat();
        scanner.close();
        return number;
    }
}
