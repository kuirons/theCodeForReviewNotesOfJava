package java8;

import java.util.ArrayList;
import java.util.List;

/**
 * @author WuGYu
 * @date 2018/1/12 11:47
 * 这也是策略模式的一个例子，将谓词抽象成多个独立的策略，可以适应更多的需求
 */
public class Apple {
    private int heavyWeight;
    private String appleColor;

    public String getAppleColor() {
        return appleColor;
    }

    public void setAppleColor(String appleColor) {
        this.appleColor = appleColor;
    }

    public int getHeavyWeight() {

        return heavyWeight;
    }

    public void setHeavyWeight(int heavyWeight) {
        this.heavyWeight = heavyWeight;
    }

    public static <T> List<T> applesFilter(List<T> inventory, ApplePredicate<T> predicate){
        List<T> result = new ArrayList<>();
        for (T t :
                inventory) {
            if (predicate.test(t))
                result.add(t);
        }
        return result;
    }

    public static void main(String[] args) {
        List<Apple> testApple = new ArrayList<>();
        Apple apple1 = new Apple();
        apple1.setAppleColor("green");
        apple1.setHeavyWeight(80);
        Apple apple2 = new Apple();
        apple2.setHeavyWeight(200);
        apple2.setAppleColor("red");
        testApple.add(apple1);
        testApple.add(apple2);
        for (Apple a :
                Apple.applesFilter(testApple,  (Apple a) -> "green".equals(a.getAppleColor()))) {
            System.out.println(a.getAppleColor());
        }
        for (Apple a :
                Apple.applesFilter(testApple, (Apple a) -> a.getHeavyWeight() > 150)) {
            System.out.println(a.getHeavyWeight());
        }
    }
}

interface ApplePredicate<T>{
    boolean test(T t);
}

