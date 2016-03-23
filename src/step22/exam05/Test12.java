// 주제: 인스턴스 읽기 - ObjectInputStream 데코레이터 사용
package step22.exam05;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.BufferedInputStream;


public class Test12 {
    public static void main(String[] args) throws Exception /* | IOException, ClassNotFoundException*/ {
      // 실제 작업을 수행할 객체를 준비한다.
      FileInputStream in0 = new FileInputStream("exam05.Test11.data");
      BufferedInputStream in1 = new BufferedInputStream(in0);
      ObjectInputStream in = new ObjectInputStream(in1);

      Member2 m1 = (Member2)in.readObject();
      Member2 m2 = (Member2)in.readObject();

      in.close();
      in1.close();
      in0.close();

      System.out.println(m1);
      System.out.println(m2);
    }
  }
