// 주제: 인스턴스 읽기
package step22.exam05;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.DataInputStream;
import java.io.BufferedInputStream;



public class Test09 {
    public static void main(String[] args) throws IOException {
      // 실제 작업을 수행할 객체를 준비한다.
      FileInputStream in0 = new FileInputStream("exam05.Test08.data");
      BufferedInputStream in1 = new BufferedInputStream(in0);
      DataInputStream in = new DataInputStream(in1);

      Member m1 = new Member();
      // 출력한 순서대로 읽어줘야함
      m1.name = in.readUTF();
      m1.age = in.readInt();
      m1.height = in.readInt();
      m1.weight = in.readInt();

      Member m2 = new Member();
      m2.name = in.readUTF();
      m2.age = in.readInt();
      m2.height = in.readInt();
      m2.weight = in.readInt();

      in.close();
      in1.close();
      in0.close();

      System.out.println(m1);
      System.out.println(m2);
    }
  }
