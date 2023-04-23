//Author: A.Pavlinov
//Netology Java Course

//терминальные операции в StreamAPI
//toArray - преобразует лист строчек в массив объектов

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<String>();
        stringList.add("one");
        stringList.add("two");
        stringList.add("three");

        Stream<String> stream = stringList.stream();
        Object[] objects = stream.toArray();
        System.out.println(objects[0] + " " + objects[1] + " " + objects[2]);
    }
}