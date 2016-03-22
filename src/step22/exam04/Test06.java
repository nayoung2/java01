// 주제 : 원시 타입 값을 출력하기 - Refactoring(코드 개선) : 상속 사용
package step22.exam04;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.IOException;


public class Test06 {
    public static void main(String[] args) throws IOException {
      MyDataOutputStream4 out = new MyDataOutputStream4("exam04.Test06.data");
      
      short no = 17;
      int kor = 100;
      int eng = 89;
      int math = 75;


      out.writeShort(no);
      out.writeInt(kor);
      out.writeInt(eng);
      out.writeInt(math);

      out.close();
    }
  }

// MyDataOutputStream3, Test05까지만 해도 인스턴스 out의 타입은 OutputStream으로
// 그의 자식 클래스인 FileOutputStream과 ByteArrayInputStream 모두 가능했다. (유연한 구조)
// Test05의 FileOutputStream out = new FileOutputStream("exam04.Test05.data"); 을
// ByteArrayOutputStream out = new ByteArrayOutputStream(); 로만 쓰면 됐다.
// 하지만 MyDataOutputStream4에서는 ByteArrayOutputStream불가능 ㅠ
//FileOutputStream
