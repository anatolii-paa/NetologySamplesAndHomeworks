//Author: A.Pavlinov
//Netology Java Course

//терминальные операции в StreamAPI
//Find - ищет элемент в стриме

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("Java Script","Java 8","Java 11","Android","Spring");

        Optional<String> result = strings.parallelStream()
                        .filter(s -> s.contains("Java"))
                                .findFirst();

        result.ifPresentOrElse(
                System.out::println,
                () -> System.out.println("There is no Java :(")
        ); //JavaScript


    }
}