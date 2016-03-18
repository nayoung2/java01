// 주제 : Exception 예외 던지고 받기
package step19;

import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;


public class Test9 {
  public static void main(String[] args) /*throws Exception*/ {
    MyClass obj = new MyClass();

    // Exception 예외는 반드시 처리해야 한다.
    // => try~catch로 처리하던지
    // => 메서드 선언부에 (이 메서드에)어떤 예외가 발생하는지 명시하던지.
    // 예)   public static void main(String[] args) throws Exception { ... }
    // obj.m2();

    try {
      obj.m2();
    } catch (Exception e) {
      System.out.println("m2()에서 오류 발생!");
    }

  }
}

/*


*/
