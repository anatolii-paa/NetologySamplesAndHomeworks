//Author: A.Pavlinov
//Netology Java Course

//Sorted - метод применяется для сортировки элементов источника стрима
//при этом результат можно получить в зависимости от типа используемого компаратора

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("9", "A", "Z", "1", "B", "Y", "4", "a", "c");
        list.stream()
            .sorted(Comparator.naturalOrder())
            .forEach(System.out::print); // 149ABYZac
        System.out.println();
        list.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::print); // caZYBA941

    }
}