import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

//        int[] input = {50, 60, 70, 80, 90, 100};
//        List<Integer> result = new ArrayList<>();
        List<String> list = Arrays.asList("My", "Pen", "Is", "Black");
        list.stream()
                .filter(x -> x.length() >= 3)
                .map (String::toUpperCase)
                . forEach(System.out::println);
//        int count = 0;
//        for (int x: input) {
//            if (x >= 90) continue;
//            x += 10;
//            count++;
//            if (count > 3) break;
//            result.add(x);
//        }
        System.out.println(list);
    }
}