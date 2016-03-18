/* 주제 : String 주요 도구 사용법3 - 스태틱 메서드 */

package step03;

public class Exam09 {
  public static void main(String[]args) {
    String s1 = "we";
    String s2 = "taxi";

    String s3 = String.format("Will %s take a %s?", s1, s2); //format : printf와 사용법이 똑같다.
    System.out.println(s3);

    }
  }

/*
도구(method)의 종류
=> static method
  - 클래스 이름으로 바로 사용할 수 있는 도구
  - 특정 물건에 상관없이 사용할 수 있다.
  예) format()

=> instance method
  - 반드시 물건이 있어야만 사용할 수 있는 도구
  - 특정 물건에 대해 작업을 수행한다.
  예) concat(), replace()
  - ex s1.concat(...), s1.replace(...)

  API 문서를 보고 메서드의 종류를 알아내기
  => method signature의 static이 선언되어 있으면 static 메서드 이다.
  => 그 밖에는 모두 인스턴스(non-static)메서드이다.

  String.replace 로는 실행할 수 X (절대 String으로 호출할 수 X)
  s1.replace - s1이라는 특정 String에서 명령을 수행
*/
