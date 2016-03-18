/* 주제: 변수와 메서드 정리 - 스태틱 변수의 사용 */
package step12;

public class Exam04 {
  public static void main(String[] args) {
    Car.model = "티코";
    Car.maker = "비트자동차";
    Car.cc = 2000;
    Car.capacity = 5; // 클래스당 한개만 존재 => 또 다른 자동차의 정보를 입력할 수 없다.

    // 스태틱 변수를 사용하면 오직 한 대의 자동차 정보만 저장할 수 있다.
    // 다음과 같이 다른 자동차 정보를 저장하려 하면
    // 기존 정보가 지워진다.
    Car.modle = "그랜저";

  }

}
