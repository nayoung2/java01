// 주제 : 원시 타입 값을 출력하기 - Refactoring(코드 개선) : Decorator 패턴
package step22.exam04;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.IOException;


public class Test07 {
    public static void main(String[] args) throws IOException {
      // 실제 작업을 수행할 객체를 준비한다.
      FileOutputStream out = new FileOutputStream("exam04.Test07.data");

      // 작업할 객체에 보조 기능을 장착한다.
      // => 보조 기능을 가진 객체를 "데코레이터(decorator)"라 부른다.
      // => 보조 기능은 필요할 때 언제나 붙일 수 있다.
      //    필요 없으면 떼면 된다.
      OutputStreamDecorator1 d1 = new OutputStreamDecorator1(out);
      OutputStreamDecorator2 d2 = new OutputStreamDecorator2(d1); // out 기능에 D1이라는 기능을 덧붙인 것에 D2를 덧붙인다.
      // short 쓰지 않을 경우(OutputStreamDecorator1 쓰지 X)는 OutputStreamDecorator2 d2 = new OutputStreamDecorator2(out);만 하면 된다.

/*
        MyDataOutputStream3 obj = new MyDataOutputStream3(out); // MyDataOutputStream3는 Object를 상속받음
        OutputStreamDecorator2 d2 = new OutputStreamDecorator2(obj); // 불가능 obj는 OutputStream타입이 아니기 때문.

*/

      short no = 17;
      int kor = 100;
      int eng = 89;
      int math = 75;


      d1.writeShort(no);
      d2.writeInt(kor);
      d2.writeInt(eng);
      d2.writeInt(math);

      out.close();
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
