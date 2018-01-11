/**
 * Created by khx on 17-9-17.
 */
public class ResponsiveUI extends Thread{
    private static volatile double d=1;
    public ResponsiveUI(){
        setDaemon(true);
        start();
    }
    public void run(){
        while(true){
            d=d+2/d;
        }
    }

    public static void main(String[] args) throws Exception{
        new ResponsiveUI();
        System.in.read();
        System.out.println(d);
    }
}


