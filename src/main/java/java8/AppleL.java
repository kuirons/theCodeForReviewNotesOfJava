package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author WuGYu
 * @date 2018/1/12 14:47
 */
public class AppleL {
    private int heavyWeath;
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHeavyWeath() {

        return heavyWeath;
    }

    public void setHeavyWeath(int heavyWeath) {
        this.heavyWeath = heavyWeath;
    }

    public static void main(String[] args) {
        List<AppleL> inventory = new ArrayList<>();
        AppleL appleL1 = new AppleL();
        appleL1.setColor("red");
        appleL1.setHeavyWeath(200);
        AppleL appleL2 = new AppleL();
        appleL2.setHeavyWeath(100);
        appleL2.setColor("green");
        inventory.add(appleL1);
        inventory.add(appleL2);
        inventory.sort(Comparator.comparingInt(AppleL::getHeavyWeath));
        for (AppleL a :
                inventory) {
            System.out.println(a.getHeavyWeath());
        }
    }
}