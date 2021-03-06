/*주제 : 메서드 정의하기3*/
//step06 메서드

package step06;

public class Exam03 {

  // 값을 리턴하는 메서드 정의하기
  static String hello() {
    return "안녕하세요";
  }

  public static void main(String[] args) {
    // 값을 반환하는 메서드 실행
    // => 주는 것 안받아도 된다. (문법적 오류 X)
    hello();

    // => 메서드가 주는 것 받고 싶다면 그 데이터를 담을 변수를 준비하라.
    String str;
    str = hello();  // 실제로는 문자열이 아니라 문자열 물건의 주소를 리턴한다.
    System.out.println(str);

    String str2 = hello();
    System.out.println(str2);

    // => 리턴하는 데이터 타입과 다른 변수를 선언하면 할당 오류 발생!
    //int value = hello(); // 컴파일 오류!
  }
}



/* 메서드?
  1) 코드 관리 관점 =>
  - 특정 기능을 수행하는 명령어들의 묶음으로써 명령어들을
  - 좀 더 조직적으로 관리할 수 있다.
  - 한 번 작성한 명령어들을 재사용하기가 쉽다.

  2) 사용자 데이터 타입을 정의하는 관점 =>
  - 개발자가 새로 정의한 데이터를 다루기 위해 만든 연산자.

  3) 물건 중심(Object-Oriented)의 관점 =>
  - 물건에게 명령을 내리는 도구이다.
  - OOA/OOD(객체지향 분석, 설계)에서는 메세지(message)라 부르기도 한다.

메서드 정의 문법?
static [리턴타입] 메서드이름(파라미터 선언, ...) {
  명령어...
  명령어...
  return [리턴할값];
}
  => 리턴타입 : 메서드가 리턴하는 값의 종류
    - 리턴할 값이 없다면 void로 선언한다.
  => 파라미터 선언 : 메서드를 실행할 때 외부에서 주는 값을 받는 변수
    - 외부에서 값을 받을 일이 없다면 변수를 선언하지 않는다.
  => return : 메서드 실행을 끝낸 후 그 결과를 반환하는 명령어.

  메서드 실행?
  => 리턴값을 받을 변수 = 메서드이름(값, 값, 값 ... );
      (리턴값을 받아야 할 때)

*/
