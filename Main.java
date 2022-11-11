package Project;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
        String delimeter = " "; // Разделитель
        String[] p;
        List<String> lines = new ArrayList<>();
        List<Person> persones = new ArrayList<>();
        Path path = Paths.get(".//src//project//file.txt");

        try (Stream<String> lineStream = Files.lines(path)) {
            lines = lineStream.toList();
        } catch (IOException ignored) {
            throw new Exception("Ошибка при чтении файла");
        }

        int i = 1;
        for (String n:lines) {
            p = n.split(delimeter);
            if (p.length == 4){
                Person per = new Person(p[0],p[1],p[2],p[3]);
                persones.add(per);
                i=i+1;
            }
            else throw new Exception ("Неправильное количество слов в строке " + i);
        }
        for (Person per:persones) {
            System.out.println(per);
        }
    }

}