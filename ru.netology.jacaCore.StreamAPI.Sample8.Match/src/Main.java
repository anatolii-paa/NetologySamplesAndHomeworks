//Author: A.Pavlinov
//Netology Java Course

//терминальные операции в StreamAPI
//Match - Match - Применяют для проверки наличия сопадающего объекта в источнике стрима.
//В качестве аргумента используется предикат

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("one", "otwo", "othree");

        boolean anyMatch = list.stream()
                .anyMatch(value -> value.startsWith("o"));

        boolean allMatch = list.stream()
                .allMatch(value -> value.startsWith("o"));

        boolean noneMatch = list.stream()
                .noneMatch(value -> value.startsWith("q"));

        System.out.println(anyMatch);
        System.out.println(allMatch);
        System.out.println(noneMatch);

    }
}