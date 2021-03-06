import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
// 缓冲输入文件
public class BufferedInputFile {
  public static String read(String filename) throws IOException {
    BufferedReader in = new BufferedReader(new FileReader(filename));
    StringBuilder sb = new StringBuilder();
    String s;
    while ((s = in.readLine()) != null) {
      sb.append(s + "\n");
    }
    in.close();
    return sb.toString();
  }

  public static void main(String[] args) throws IOException {
    System.out.println(read("E:\\test\\test.txt"));
  }
}
