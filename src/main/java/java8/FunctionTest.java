package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * @author WuGYu
 * @date 2018/1/12 17:36
 */
public class FunctionTest {
    public static <T,R> void string2Lenght(List<T> list, Function<T,R> function){
        for (T t :
                list) {
            System.out.println(function.apply(t));
        }
    }

    public static void main(String[] args) {
        FunctionTest.string2Lenght(Arrays.asList("lalalal","papapa","hh"),(String s) -> s.length());
    }
}
