// 주제 : 대용량 데이터 쓰기 - 버퍼링 데코레이터 사용 전
package step22.exam05;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.DataInputStream;



public class Test06 {
    public static void main(String[] args) throws IOException {
      // 실제 작업을 수행할 객체를 준비한다.
      FileOutputStream out = new FileOutputStream("exam05.Test06.data");
      long start = System.currentTimeMillis();

      for (int i = 0; i < 5000000; i++) {
        out.write(0x41);
      }
      long end = System.currentTimeMillis();
      System.out.printf("걸린시간 : %d\n", end - start);

      out.close(); // close 안해줄 시 프로그램 종료시 JVM이 종료..
    }
  }
