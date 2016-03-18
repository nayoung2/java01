// 주제 : 하위 클래스에서 부모 클래스의 protected 멤버에 접근하기

package step14.exam10; // 하위 패키지인것과 관계 없이 각각 별개의 패키지로 본다

import step14.Calculator3; // => 패키지가 다르기 때문에 import로 정확히 명시해줌

public class ChildCalc extends Calculator3 {
  public void testAccess() {
    // 1) public 멤버에 접근하기
    //super.remainder(); // 주의! super : 수퍼 클래스를 의미하는 것이 아니라 재정의 하기 전의 메소드를 가리킨다.=> exam11/A.java
    this.remainder(3);
    // 2) (default) 멤버에 접근하기
    //this.abs2(); // 접근불가 오류

    // 3) protected 멤버에 접근하기
    this.abs();

    //4) private 멤버에 접근하기
    //this.abs3(); //오류! 접근 불가


  }
}
// >javac -cp libs/calc.jar -d bin -sourcepath src src/step14/ChildCalc.java
//                                 ----------------
//                                  ChildCalc가 사용하는 소스들이 들어있는 폴더만 지정을 해주면 파일을 찾아 알아서 먼저 컴파일 해준다.
// -cp libs/calc.jar : Calculator3 가 calc.jar 안의 Calculator.class를 사용하기 때문에!

/* 캡슐화 접근 관리
- private : 그 클래스 내부에서만 접근 가능
- (default) : 같은 패키지에 소속된 클래스만 접근 가능
- protected : 같은 패키지 + 자식 클래스
- public : 모두 접근 가능.
*/
