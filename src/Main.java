import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws IOException {
      File file = new File("hello.text");
      if (!file.exists()){
          System.out.println(file.createNewFile());
      }

        InputStream in = System.in;
      while (true){
          System.out.println("Nhập 1 ký :");
          int ch = in.read();
          if (ch == 'q'){
              System.out.println("Finished!");
              break;
          }
          in.skip(2);
          System.out.println("ký tự nhận được " + (char)ch);
      }



    }
}