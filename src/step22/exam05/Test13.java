// 주제: 인스턴스 읽기 - ObjectInputStream 데코레이터 사용

package step22.exam05;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.BufferedOutputStream;

public class Test13 {
    public static void main(String[] args) throws IOException {
      Member3 m1 = new Member3("홍길동", 20, 180, 70);

      Member3 m2 = new Member3("임꺽정", 45, 178, 98);
      // 실제 작업을 수행할 객체를 준비한다.
      FileOutputStream out0 = new FileOutputStream("exam05.Test13.data");
      BufferedOutputStream out1 = new BufferedOutputStream(out0);
      ObjectOutputStream out = new ObjectOutputStream(out1);

      out.writeObject(m1);
      out.writeObject(m2);

      out.close();
      out1.close();
      out0.close();
    }
  }

/*
기존 파일보다 용량증가 (클래스 정보까지 포함했기 때문)

*/
