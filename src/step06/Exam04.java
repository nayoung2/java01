/*주제 : 메서드 정의하기4*/
//메서드 정의엔 4가지 유형이 잇수요

package step06;

public class Exam04 {

  // 값도 받고 값도 리턴하는 메서드 정의하기
  static String hello(String localeCode) { //http://www.oracle.com/technetwork/java/javase/javase7locales-334809.html
    switch (localeCode) {
      case "ko_KR":
        return "안녕하세요"; //return 현재 메소드의 실행을 중지시키고 바로 값을 반환 => break;를 안넣어줘도 됨
      case "ja_JP":
        return "こんにちは";
      case "zh_CN":
        return "你好";
      default: // 그 외에는
        return "Hello";
    }
  }

  public static void main(String[] args) {
    String str = hello("ko_KR");
    System.out.println(str);

    str = hello("zh_CN");
    System.out.println(str);

    str = hello("en_US");
    System.out.println(str);
  }
}




/* 용어 정리
메서드 시그너처(method signature) ?
=> C, C++ 언어에서는 function prototype 이라고 부른다.
=> 메서드 이름, 파라미터, 리턴 타입 정보를 말한다.
=> 예) String hello(String localeCode)

인자 값(argument)?
=> 메서드를 실행할 때 전달하는 값.
=> 예) String str = hello("ko_KR");
      에서의 Ko_KR 이 아규먼트이다

파라미터(parameter) ?
=> 인자 값을 받기 위해 선언한 변수
=> String hello(String localeCode) {...}
=> 예) localeCode 변수가 파라미터 이다.

일상에서는 아규먼트와 파라미터를 구분하지 않고 섞어 쓴다.










*/
