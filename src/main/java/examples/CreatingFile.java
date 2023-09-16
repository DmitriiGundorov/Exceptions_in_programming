package examples;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CreatingFile {
    public static void creatingFile(String text, String name) {
        boolean indicatorFile = false;
        String str = "";
        if (Files.exists(Path.of(name + ".txt"))) {
            str = readFile(name);
            if (!str.contains(text)) {
                indicatorFile = true;
                writerFile(name, text, indicatorFile);
                System.out.printf("Данные успешно добавлены в файл <%s>\n", name);
            } else {
                System.out.println("Введенные данные существуют");
            }
        } else {
            writerFile(name, text, indicatorFile);
            System.out.println("Файл " + name + ".txt успешно создан");
        }
    }

    public static String readFile(String name) {
        try (FileReader reader = new FileReader(name + ".txt")) {
            int read;
            StringBuilder str = new StringBuilder();
            while ((read = reader.read()) != -1) {
                str.append((char) read);
            }
            return str.toString();
        } catch (IOException e) {
            throw new RuntimeException("Ошибка чтения файла " + e);
        }
    }

    public static void writerFile(String name, String text, boolean indicator) {
        try (FileWriter writer = new FileWriter(name + ".txt", indicator)) {
            writer.write(text + "\n");
        } catch (IOException e) {
            throw new RuntimeException("Ошибка записи файла" + e);
        }
    }
}