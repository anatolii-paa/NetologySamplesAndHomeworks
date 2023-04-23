//Author: A.Pavlinov
//Netology Java Course

//терминальные операции в StreamAPI
//Collect - терминальная операция, запускающая внутреннюю итерацию
//элементов и сбор элементов стрима в коллекцию

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("one", "two", "three");

        List<String> uppercaseList  = list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(uppercaseList);

    }
}