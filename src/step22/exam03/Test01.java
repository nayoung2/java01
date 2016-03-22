// 주제 : 바이트 값을 파일이 아닌 메모리(바이트 배열)로 출력하기
package step22.exam03;

import java.io.File;
import java.io.ByteArrayOutputStream;
import java.io.IOException;


public class Test01 {
  public static void main(String[] args) throws IOException{
    ByteArrayOutputStream out = new ByteArrayOutputStream();

    int value = 0x2a3b4c5d; // 708529245(10진수)
     // ByteArrayOutputStream이 관리하는 내부 바이트 배열에 출력한다.
     // 중요!
     // => 메모리에 데이터를 저장할 때도 꼭 파일로 출력하는 것 처럼
     //    프로그래밍을 짤 수 있다.
     // => 데이터를 저장하는 대상이 파일이든, 메모리이든 간에
     //    일관된 방식(read()/wtite())으로 프로그래밍을 할 수 있다.
     // => "이것이 스트림 프로그래밍이다."
    out.write(value>>24);
    out.write(value>>16);
    out.write(value>>8);
    out.write(value);

    // 주의! OS 자원을 사용하는 경우, 사용 후 반드시 해제해야 한다.
    out.close();
    //write 완료, out에 채워진 값을 꺼낸다.

    byte[] bytes = out.toByteArray();
    for (byte b : bytes) {
      System.out.println(Integer.toHexString(b));
    }

  }
}
//개하기싫다....................................쁘야아아아아아아
