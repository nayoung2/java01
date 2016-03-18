// 주제 : 다형적 변수를 사용할 때 제약 조건
package step15;

public class DelTest4 {
  public static void main(String[] args) {
    DeveloperCalculator c = new DeveloperCalculator();
    c.init(10); // <-- Calculator의 메서드
    c.multiple(2); // <-- CalculatorPlus의 메서드
    c.printResult(2); // <-- DeveloperCalculator의 메서드

    // 왜 하위 클래스의 레퍼런스는 상위 클래스의 인스턴스를 가리킬 수 없는가?
    // 만약 다음 코드가 가능하다면,
    DeveloperCalculator c = new CalculatorPlus();
    c.init(10); // init()을 찾을 수 있다. OK
    c.multiple(2); // multiple()을 찾을 수 있다. OK
    c.printResult(2); // 실행할 수 없다.
                      // CalculatorPlus에 정의되지 않은 메서드이다.


  }
}
