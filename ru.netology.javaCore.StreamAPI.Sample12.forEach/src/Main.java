//Author: A.Pavlinov
//Netology Java Course

//терминальные операции в StreamAPI
//forEach - запускает внутреннюю итерацию в стриме и применяет Consumer к каждому элементу в стриме


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("Java Script; ","Java 8; ","Java 11; ","Android; ","Spring; ");
        Stream<String> stream = stringList.stream();
        stream.forEach(System.out::print);
    }
}