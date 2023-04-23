//Author: A.Pavlinov
//Netology Java Course

//Limit - ограничивает количество элементов в стриме

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("one", "two", "three", "one", "two");
        list = list.stream()
                .limit(2)
                .collect(Collectors.toList());
        System.out.println(list); // [one, two];
    }
}