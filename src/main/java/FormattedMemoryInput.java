import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;

public class FormattedMemoryInput {
    public static void main(String[] args) throws IOException {
        try {
            DataInputStream in = new DataInputStream(new ByteArrayInputStream(BufferedInputFile.read("E:\\test\\test.txt").getBytes()));
            while (true) {
                System.out.println((char) in.readByte());
            }
        }catch (EOFException e){
            System.out.println("读取完毕");
        }
    }
}
