package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author WuGYu
 * @date 2018/1/12 17:19
 */
public class ConsumerTest {
    public static <T> void forEach(List<T> list,Consumer<T> consumerTest){
        for (T t :
                list) {
            consumerTest.accept(t);
        }
    }

    public static void main(String[] args) {
        List<String> testString = new ArrayList<>();
        testString.add("");
        testString.add("askdfj");
        testString.add("afw");
        ConsumerTest.forEach(testString,(String s) -> {
            s+="我是结尾哈哈哈~~~~";
            System.out.println(s);
        });
    }
}
