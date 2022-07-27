import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

import static java.util.Collections.sort;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Homework {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        sort(nums);
//1 задание
        for (Integer i : nums) {
            if (!(i % 2 == 0)) {
                System.out.print(i + " ");
            }
        }

// 2 задание
        System.out.println();
        Integer a = 0;
        for (Integer i : nums) {
            if (i % 2 == 0 && i > a) {
                a = i;
                System.out.print(a + " ");
            }
        }
// 3 задание
        System.out.println();
        List<String> words = new ArrayList<>(List.of("а", "б", "б", "б", "д", "в", "а", "а", "в", "б", "г"));
        sort(words);
        System.out.println(words);
        String newWord = null;
        for (int i = 0; i < words.size(); i++) {
            if (!(words.get(i).equals(newWord))) {
                newWord = words.get(i);
                System.out.println(newWord);
            }
        }
// 4 задание
        System.out.println(words.stream().collect(groupingBy(Function.identity(),counting())));
    }
}

