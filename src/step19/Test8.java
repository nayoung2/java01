// 주제 : RuntimeException 예외 던지고 받기
package step19;

import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;


public class Test8 {
  public static void main(String[] args) {
    MyClass obj = new MyClass();

    // 1) RuntimeException 예외를 처리하지 않으면 (MyClass에서 던진 예외를 받지 않음)
    // 자동으로 (main의)상위 호출자(JVM)에게 전달한다.
    //obj.m1();

    // 2) try~catch로 예외 처리를 할 수도 있다.
    try {
      obj.m1();
    } catch (RuntimeException e) {
      System.out.println("m1()에서 오류 발생!");
    }
  }
}

/*


*/
