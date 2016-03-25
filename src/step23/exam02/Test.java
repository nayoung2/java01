// 주제 : 상속을 통해 호출 방법을 제약하기
// 1) Hello와 HelloEn 클래스의 공통점을 식별하여 수퍼 클래스로 정의한다.
//  => Hello 추상 클래스 작성
//  => HelloKo, HelloEn을 이 클래스의 서브클래스로 만든다.
// 2) Hello의 서브 클래스만 사용하려면,
//    =>레퍼런스 변수를 AbstractHello로 선언하라!
package step23.exam02;

public class Test {
  public static void main(String[] args) {
    //JVM 옵션 : -Dlang=값
    // 값 => en,ko
    // null => ko
    String lang = System.getProperty("lang");

    String message = null;
    Hello obj = null; // 2).  레퍼런스로 변수를 이용하여
    // 인사말을 리턴할 객체의 타입을 한정한다. (Hello의 서브클래스만 가능!)
    if("en".equals(lang)) {
      obj = new HelloEn();
      message = obj.greet();
    } else if("jp".equals(lang)){ //**
      obj = new HelloJp();      // Hello의 서브클래스가 아니면 컴파일 오류!
      // Hello의 규칙을 따르지 않은 클래스를 사용하려 한다면
      // 컴파일 오류가 발생한다!
      // => 이런 방식(수퍼 클래스를 통한)으로 호출 규칙을 제어할 수 있다.

      message = obj.sayHello();
    }
    else {
      obj = new HelloKo();
      message = obj.greet();
    }
    //어떤 객체인진 모르겠지만, 그 객체는 Hello의 서브 클래스이기 때문에
    //반드시 greet()라는 메서드가 있을 것이다.
    // => 바로 이것이 상속을 이용한 호출 규칙을 제한하는 방법이다.
    System.out.println(message);
  }
}
