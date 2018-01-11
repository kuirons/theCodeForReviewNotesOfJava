/**
 * Created by khx on 17-9-3.
 */

public class theControlAndExecutionFlow {
    //测试switch是否包含break的区别
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            switch (i){
                case 0:System.out.println("0");
                case 1:System.out.println("1");
                case 2:System.out.println("2");
                default:System.out.println("error");
            }
        }
    }
}
