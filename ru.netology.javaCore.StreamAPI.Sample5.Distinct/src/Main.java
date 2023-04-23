//Author: A.Pavlinov
//Netology Java Course

//Distinct - используется для дедупликации в стримах

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("one", "two", "three", "one", "two");
        list = list.stream()
        .distinct()
        .collect(Collectors.toList());
        System.out.println(list); // [one, two, three];
    }
}