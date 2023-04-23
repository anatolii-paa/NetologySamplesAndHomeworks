//Author: A.Pavlinov
//Netology Java Course

//терминальные операции в StreamAPI
//min & max - терминальные операции, которые возвращают наименьший и наибольший элемент стрима

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(-171,2,5,10);
        Optional<Integer> min = intList.stream().min(Integer::compareTo);
        if (min.isPresent()) {
            Integer minString = min.get();
            System.out.println(minString);
        }

        Optional<Integer> max = intList.stream().max(Integer::compareTo);
        if (max.isPresent()) {
            Integer maxString = max.get();
            System.out.println(maxString);
        }

    }
}