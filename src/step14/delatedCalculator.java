/* 인스턴스 주소를 쉽게 받는 메서드 - 인스턴스 메서드  */

package step14;

public class Calculator {
  // 인스턴스 변수
  int result;

  // 인스턴스 메서드를 실행할 때 넘어오는 인스턴스 주소는
  // 메서드의 감춰진 변수인 this에 자동 보관된다. (this는 직접 선언해주지 않는다)
  // => 따라서 이 메서드를 호출할 때는 반드시 인스턴스 주소를 줘야 한다.
  // => 그래서 "인스턴스 메서드"라 부른다.
  public void plus(/*Calculator4 this,*/ int a) {
    this.result+= a;
  }
  public void minus(/*Calculator4 this,*/int a) {
    this.result -= a;
  }
  public void multiple(/*Calculator4 this,*/ int a) {
    this.result *= a;
  }
  public void divide(/*Calculator4 this,*/ int a) {
    this.result /= a;
  }
}


/* 자르 파일 생성
~/workspace/java01 $ cd bin
~/workspace/java01/bin $ jar cvf calc.jar step14/Calculator.class
                                ------    -----------------------
                                jar파일 이름   jar 파일 안에 step14 폴더 안에 Calculator를 넣어줌
Manifest를 추가함
추가하는 중: step14/Calculator.class(입력 = 486) (출력 = 280)(42%를 감소함

=> bin 폴더에 calc.jar 생성됨

=> java01에 libs 폴더를 만들어 생성된 jar파일 넣고 이 파일은 지운다 ㅠㅠ
=> bin/step14에 있는 Calculator4.class도 지워줌
=> 이 파일은 이제 없는것. ( 다른 사람이 공유한 jar파일, 즉 class 파일만 받은 경우와 같게 만들었다.)

*/
