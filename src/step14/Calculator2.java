// 기존의 클래스를 상속 받아서 메서드 추가하기
/*

  class 내클래스 extends 기존클래스 {
    ...
  }
용어 정리:
- 기존 클래스를 "super class" 또는 "parent class"라 부른다.
- 확장하는 클래스를 "sub class" 또는 "child class"라 부른다.

*/
package step14;

public class Calculator2 extends Calculator { // Calculator도 같은 package(step14)에 있기 때문에 import 할 필요 없다/
  // 메서드 추가
  public void remainder(int a) {
    this.result %= a;  // result가 default => 같은 패키지면 사용 가능
  }


}



/* *******************
    같은 패키지
***********************8
package 뒤에 지정해준게 같으면 같은 패키지!! jar 파일로 따로 묶었지만 그래도 package step14라고
해놨기 때문에 같은 패키지
*/
