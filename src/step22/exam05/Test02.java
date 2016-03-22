// 주제 : 원시 타입 값을 읽기 - Java에서 제공하는 데코레이터 사용하기
package step22.exam05;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.DataInputStream;


public class Test02 {
    public static void main(String[] args) throws IOException {
      // 실제 작업을 수행할 객체를 준비한다.
      FileInputStream in = new FileInputStream("exam04.Test06.data");
      DataInputStream in2 = new DataInputStream(in); // <-- 데코레이터

      short no = in2.readShort();
      int kor = in2.readInt();
      int eng = in2.readInt();
      int math = in2.readInt();

      System.out.println(no);
      System.out.println(kor);
      System.out.println(eng);
      System.out.println(math);

      in2.close();
      in.close();

    }
  }

/*
Decorator 디자인 패턴
=> 기능을 "선택적으로" 추가/삭제 할 수 있게 한다.
  (상속은 이가 불가하다.)

Decorator는 스스로는 아무것도 할 수 없음. (base가 필요..)
*/


/*
Java I/O API
=> Decorator 패턴이 적용 되어 있다.

notebook
<<abstract>>
OutputStream
      FileOutputStream
      ByteOutputStream
      PipedOutputStream


      <<Decorator>>>
      FilterOutputStream
            BufferedOutputStream    -> Decorator
            DataOutputStream        -> Decorator
*/
