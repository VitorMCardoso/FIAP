package br.com.fiap;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestReadFile {

    public static void main(String[] args) throws IOException{

        String fileName = "C:\\Users\\logonrmlocal\\Documents\\Listas\\src\\main\\java\\br\\com\\fiap\\lines.txt";
        List<String> list = new ArrayList<>();

        Stream<String> stream = Files.lines(Paths.get(fileName));
            list = stream
                    .filter(line -> !line.startsWith("line3"))
                    .map(String::toUpperCase)
                    .collect(Collectors.toList());
        list.forEach(System.out::println);
    }

}
