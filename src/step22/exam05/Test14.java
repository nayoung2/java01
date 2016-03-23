// 주제 : 인스턴스 읽기 - Object
package step22.exam05;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.BufferedInputStream;


public class Test14 {
    public static void main(String[] args) throws Exception /* | IOException, ClassNotFoundException*/ {
      // 실제 작업을 수행할 객체를 준비한다.
      FileInputStream in0 = new FileInputStream("exam05.Test13.data");
      BufferedInputStream in1 = new BufferedInputStream(in0);
      ObjectInputStream in = new ObjectInputStream(in1);

      Member3 m1 = (Member3)in.readObject();
      m1.calculateBMI(); // transient 필드의 값을 설정한다. BMI 계산 수행.
      Member3 m2 = (Member3)in.readObject();
      m2.calculateBMI(); // transient 필드의 값을 설정한다. BMI 계산 수행

      in.close();
      in1.close();
      in0.close();

      System.out.println(m1);
      System.out.println(m2);
    }
  }
