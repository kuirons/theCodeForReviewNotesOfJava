import java.util.TreeMap;

/**
 * Created by khx on 17-9-24.
 */
public class interrupt extends Thread {
    @Override
    public void run() {
        while(!Thread.currentThread().isInterrupted()){
            System.out.println("测试线程运行中");
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("测试线程已被中断");
                System.out.println(Thread.currentThread().isInterrupted());
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("测试线程结束");
    }

    public static void main(String[] args) throws Exception{
        interrupt test=new interrupt();
        test.start();
        Thread.sleep(3000);
        System.out.println("请求结束测试线程");
        test.interrupt();
        Thread.sleep(3000);
        System.out.println("程序结束");
    }
}
