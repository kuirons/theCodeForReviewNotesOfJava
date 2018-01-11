import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by khx on 17-9-13.
 */
public class JavaIO {
    public void testTheIoMethod() {
        System.out.println("input");
        try {
            char c = (char) System.in.read();
            System.out.println("" + c);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void testTheBufferedReaderMethod(){
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入：");
        try{
            System.out.println(in.readLine());
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        JavaIO test = new JavaIO();
//        test.testTheIoMethod();
        test.testTheBufferedReaderMethod();
    }
}
