package java8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author WuGYu
 * @date 2018/1/16 20:35
 */
public class FlatMapTest {
    public static void main(String[] args) {
        List<Integer> num1 = Arrays.asList(1, 2, 3);
        List<Integer> num2 = Arrays.asList(4, 5);
        List<int[]> result =
                num1.stream()
                        .flatMap(i -> num2.stream()
                                .map(j -> new int[]{i, j}))
                        .collect(Collectors.toList());
        List<String> result1 = result.stream().map(
                arrays -> "" + arrays[0] + "," + arrays[1]
        ).collect(Collectors.toList());
        Iterator<String> iterator = result1.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
