// 주제 : 오버라이딩(overriding)
package step14.exam05;

public class Test2 {
  public static void main(String[] args) {
    Sedan2 c = new Sedan2();

    // 수퍼 클래스의 설계도를 보고 만든 메모리
    c.model = "티코";
    c.maker = "비트자동차";
    c.cc = 2000;
    c.capacity = 5;

    // 자신의 설계도를 보고 만든 메모리
    c.isAutomatic = true;
    c.isSunroof = false;

    // Sedan에서 재정의한 메서드를 호출한다.
    c.printInfo();
  }
}

/* 상속의 의미?
- 설계도의 연결을 의미한다.

인스턴스 생성 과정
1) 수퍼 클래스의 설계도를 보고 메모리를 준비한다.
  예) Car의 model, maker, cc, capacity를 준비
2) 자신의 설계도에 따라 메모리 준비한다.
  예) Sedan의 isAutomatic, isSunroof를 준비
3) 모든 인스턴스 변수를 기본 값으로 초기화한다. (0, 문자열은 null)
4) 만약 초기화 문장이 있다면 실행한다.
  수퍼 클래스에서부터 실행한다. (수퍼 클래스 --> 자식 클래스 실행)
6) 자식 클래스 생성자를 실행한다.
  자식클래스 --> 수퍼 클래스 실행
  단 생성자 실행 시 인스턴스 블록을 먼저 실행한 후 생성자를 실행한다.

생성자 실행 절차
1) 수퍼 클래스의 생성자 실행
2) 인스턴스 블록 실행
3) 생성자 안에 있는 코드 실행

  메서드 실행
1) 인스턴스의 설계도 클래스부터 메서드를 찾는다.
2) 만약 없다면 수퍼 클래스에서 찾는다.
3) 계속 상위 클래스로 따라가면서 찾는다.
*/
