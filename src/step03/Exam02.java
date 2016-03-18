/* 주제 : 리터럴 String과 new String의 비교 */

package step03;

public class Exam02{
  public static void main(String[]args){
    // 문자열 리터럴로 String 물건 만들기
    String s1 = "Hello";
    String s2 = "Hello";

    String s3 = new String("Hello");
    String s4 = new String("Hello");

    if (s1 == s2) { //s1과 s2에는 같은 주소값이 들어있다.
      System.out.println("s1 == s2");
    }
    if (s3 == s4) {
      System.out.printf("s3 == s4");
    }

    }
  }

/*
문자열 리터럴을 이용하여 String 물건 만들기
=> 상수풀(constant pool) 메모리 방에 생성된다
=> 상수풀 메모리 방은 데이터 중복을 허용하지 않는다.
=>메모리를 절약할 수 있다.

new 명령을 사용하여 String 물건 만들기
=> 힙(heap) 메모리 방에 생성된다.
=> 데이터 중복에 상관없이 무조건 생성한다.

리터럴로 만들던지 new로 만들던지 모두 String 물건이다.
=> String 물건에 대해 모든 기능을 동일하게 이용할 수 있다.
*/
