//Author: A.Pavlinov
//Netology Java Course

//терминальные операции в StreamAPI
//Count - терминальная операция для подсчета заданных элементов в стриме

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("И долго буду тем любезен я народу");
        list.add("Что чувства добрые я лирой пробуждал");
        list.add("Что в можй жестокий век восславил я Свободу");
        list.add("И милость к падшим призывал");

        long count = list.stream()
                .flatMap(value -> Arrays.stream(value.split(" " )))
                .count();
        System.out.println(count);

    }
}