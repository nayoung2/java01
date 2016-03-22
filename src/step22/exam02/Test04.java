// 주제 : 바이트 출력하기 4- byte배열 중 특정 부분 출력
package step22.exam02;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


public class Test04 {
  public static void main(String[] args) throws IOException{
    FileOutputStream out = new FileOutputStream("exam02.Test04.data");

    byte[] bytes = {0x2a, 0x3b, 0x4c, 0x5d, 0x6f, 0x7a};

    out.write(bytes, 2, 3); // * offset => 기준으로부터 몇 번 째 떨어져 있는가. => "상대적인 주소"
                            // out.write(bytes, offset, length) => index 2부터 3개 출력

    // 주의! OS 자원을 사용하는 경우, 사용 후 반드시 해제해야 한다.
    out.close();
  }
}
