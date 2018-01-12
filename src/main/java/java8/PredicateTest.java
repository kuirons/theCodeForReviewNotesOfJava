package java8;

import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author WuGYu
 * @date 2018/1/12 17:12
 */
public class PredicateTest {
    public static <T> List<T> judge(List<T> list, Predicate<T> p){
        List<T> result = new ArrayList<>();
        for (T  t:
                list) {
            if(p.test(t))
                result.add(t);
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> testString = new ArrayList<>();
        testString.add("");
        testString.add("sasf");
        testString.add("sadfawef");
        for (String s :
                PredicateTest.judge(testString,(String s) -> !s.isEmpty())) {
            System.out.println(s);
        }
    }
}
