package examples;

public class MessageHandler {
    public static void arrayEnteredData(String[] userData) {
        int count = 0;
        int number = 0;
        if (userData.length != 4) {
            System.out.println("Вы ввели неверное количество данных, повторите ввод");
            count++;
        } else {
            if (!userData[0].matches("[а-яА-Яa-zA-Z]+")) {
                System.out.println("Неверно введена фамилия, введите строку заново");
                count++;
            } else if (!userData[1].matches("[а-яА-Яa-zA-Z]+")) {
                System.out.println("Неверно введено имя, введите строку заново");
                count++;
            } else if (!userData[2].matches("[а-яА-Яa-zA-Z]+")) {
                System.out.println("Неверно введена отчество, введите строку заново");
                count++;
            }
            try {
                Long.parseLong(userData[3]);
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат ввода данных телефона, введите строку заново");
                count++;
            }
        }
        if (count == 0) {
            StringBuilder text = new StringBuilder();
            for (int i = 0; i < userData.length; i++) {
                if (i == userData.length - 1) {
                    text.append(userData[i]);
                } else {
                    text.append(userData[i]).append(" ");
                    number++;
                }
            }
            CreatingFile.creatingFile(text.toString(), userData[0]);
        }
    }
}