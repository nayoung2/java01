// 주제 : 대용량 데이터 쓰기 - 버퍼링 데코레이터 사용 후

package step22.exam05;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.BufferedOutputStream;

public class Test07 {

    public static void main(String[] args) throws IOException {
      // 실제 작업을 수행할 객체를 준비한다.
      FileOutputStream out0 = new FileOutputStream("exam05.Test07.data");
      BufferedOutputStream out = new BufferedOutputStream(out0);

      long start = System.currentTimeMillis();

      for (int i = 0; i < 5000000; i++) {
        out.write(0x41);
      }
      long end = System.currentTimeMillis();
      System.out.printf("걸린시간 : %d\n", end - start);


      // out.flush();  // 강제적으로  버퍼에 남아있는 데이터를 방출시키는 명령!
      out.close(); // 마무리 작업을 할 것이 있으면 하라는 명령어
      out0.close();
    }
  }



// 500000 % 8192 = 2880 (BufferedOutputStream의 버퍼 크기가 8192)
// 버퍼가 가득 차야지 out0에게 데이터를 넘겨줌.
// 2880byte가 찼을 때 넘겨주지 않고 for문이 종료됨 => close() 명령어를 받으면
// 끝내기 전 마무리 작업, 즉 버퍼에 남아있는 2880byte의 데이터를 out0에게 넘겨줌
// 이 명령어가 없거나 데이터를 보내기 전에 out0먼저 close 해버리면
// 버퍼에 있던 2880byte는 날아감 ㅠ
// 4997120만 저장됨


// 제대로 close 해준 경우
//  -rw-r--r--  1 bitcamp bitcamp 5000000  3월 23 10:58 exam05.Test07.data

// 제대로 close 안 해준 경우 => 2880byte 날아감ㅋ
//  -rw-r--r--  1 bitcamp bitcamp 4997120  3월 23 11:01 exam05.Test07.data
