// 주제 : RuntimeException과 Exception의 차이
package step19;

import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;


public class Test10 {
  static void m1() {
    m2();
  }

  static void m2() {
    m3();
  }

  static void m3() {
    throw new RuntimeException();
  }

  public static void main(String[] args)  {
    try {
    m1(); // main() 에서도 예외를 처리하지 않으면 main()의 호출자인
          // JVM에게 전달된다.
          // => JVM은 냉정하게 실행을 종료하고 오류 메시지를 뿌린다.
  } catch (RuntimeException e) {
    System.out.println("예외 처리");
  }
  }
}

/*


*/
