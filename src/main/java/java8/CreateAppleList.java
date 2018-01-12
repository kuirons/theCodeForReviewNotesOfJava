package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;

/**
 * @author WuGYu
 * @date 2018/1/12 21:23
 */
public class CreateAppleList {
    public static List<Apple> map(List<Integer> list, IntFunction<Apple> function){
        List<Apple> result = new ArrayList<>();
        for (Integer i :
                list) {
            result.add(function.apply(i));
        }
        return result;
    }

    public static void main(String[] args) {
        for (Apple a :
                CreateAppleList.map(Arrays.asList(1, 2, 3, 4, 5, 6, 7), Apple::new)) {
            System.out.println(a.getHeavyWeight());
        }
    }
}
