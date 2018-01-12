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

    public static List<Apple> applesFilter(List<Apple> inventory, ApplePredicate predicate){
        List<Apple> result = new ArrayList<>();
        for (Apple apple :
                inventory) {
            if (predicate.test(apple))
                result.add(apple);
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
        ApplePredicate p1 = new AppleColorPredicate();
        ApplePredicate p2 = new AppleHeavyWeightPredicate();
        for (Apple a :
                Apple.applesFilter(testApple,  p1)) {
            System.out.println(a.getAppleColor());
        }
        for (Apple a :
                Apple.applesFilter(testApple, p2)) {
            System.out.println(a.getHeavyWeight());
        }
    }
}

interface ApplePredicate{
    boolean test(Apple apple);
}

class AppleHeavyWeightPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        if(apple.getHeavyWeight() > 150){
            return true;
        }
        return false;
    }
}

class AppleColorPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        if("green".equals(apple.getAppleColor())){
            return true;
        }
        return false;
    }
}
