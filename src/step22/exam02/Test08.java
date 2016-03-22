// 주제 : 바이트 읽기 2

package step22.exam02;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class Test08 {
  public static void main(String[] args) throws IOException{
    FileInputStream in = new FileInputStream("exam02.Test05.data");

    byte[] buf = new byte[100];

    // 배열의 특정 방부터 읽어 들인 값을 채우고 싶을 때 사용한다.
    int len = in.read(buf, 10, 3); // 10번 방 부터 최대 3개를 읽어서 채워라.
                                  // return 실제 채운 갯수 => 3
    len = in.read(buf, 10+len, 5);  // = in.read(buf.10+len,5)  채운 방 다음부터

    for(int i = 0; i < 20; i++) { // 읽은 개수만큼 반복문.
      System.out.println(Integer.toHexString(buf[i]));
    }
    // 주의! OS 자원을 사용하는 경우, 사용 후 반드시 해제해야 한다.
    in.close();
  }
}

// 하기 싫어서 죽을 것 같다 ㅜㅜㅜㅜㅜㅜㅜ
