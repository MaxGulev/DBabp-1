import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class Chek {
    boolean logiCheckFile = false;
    String newDirectoryName = "new_directory";

    public void Chek(String directoryPath, String fileName, String newDirectoryName, String destinationPath) throws IOException {

        File newDirectory = new File(directoryPath, newDirectoryName); // Создаём объект для новой дириктории
        File directory = new File(directoryPath); // создаем объект File для директории
        File[] files = directory.listFiles(); // получаем массив всех файлов в директории

        // boolean logiCheckFile = false; // флаг, который станет true, если файл найден

        // перебираем все файлы в директории
        for (File file : files) {
            if (file.isFile() && file.getName().equals(fileName)) {
                // если файл является файлом (а не директорией) и его имя совпадает с искомым
                logiCheckFile = true;
                break; // прерываем цикл, т.к. файл уже найден
            }
        }

        if (logiCheckFile) {
            boolean created = newDirectory.mkdir(); // создание новой директории




            Path source = Path.of(directoryPath, fileName);
            Path destination = Path.of(destinationPath, fileName);
            Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);

            System.out.println("Файл " + fileName + " ДА, ДА, найден в директории " + directoryPath);
            System.out.println("Файл найден в директории " + logiCheckFile);

        } else {
            System.out.println("Файл " + fileName + " НЕ найден в директории " + directoryPath);
            System.out.println("Файл НЕ найден в директории " + logiCheckFile);

        }
    }


}
