import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        int[] input = {50, 60, 70, 80, 90, 100};
//        List<Integer> result = new ArrayList<>();
        List<Integer> result = Arrays.stream(input)
                .filter(x -> x < 90)
                .map (x -> x += 10)
                .limit(3)
                .boxed()
                .collect(Collectors.toList());
//        int count = 0;
//        for (int x: input) {
//            if (x >= 90) continue;
//            x += 10;
//            count++;
//            if (count > 3) break;
//            result.add(x);
//        }
        System.out.println(result);
    }
}