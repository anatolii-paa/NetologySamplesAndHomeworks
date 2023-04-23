//Author: A.Pavlinov
//Netology Java Course

//терминальные операции в StreamAPI
//reduce - сводит все элементы к одному
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<String>();
        stringList.add("one");
        stringList.add("two");
        stringList.add("three");

        Optional<String> reduced = stringList.stream()
                .reduce((value, combinedValue) -> combinedValue + " + " + value);
        reduced.ifPresent(System.out::println); //three + two + one;

    }
}