/* 주제 : 값을 설정하고 값을 꺼내는 연산자 사용 전  => 주제 : 캡슐화 적용 전  */

package step10;

public class Exam01 {
  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;

    Score(String name, int kor, int eng, int math) { //this 변수가 숨어있다.
      this.name = name; // Heap에있는 (this 주소값의) 인스턴스 변수로 찾아가서 파라미터로 받은 name값을 저장하라.
      this.kor = kor;
      this.eng = eng;
      this.math = math;
    }

    // 사용자 정의 연산자 추가하기
    void summary() {  // 국, 영, 수 합계를 계산하는 연산자
      this.sum = this.kor + this.eng + this. math;
    }
    void average() {
      this.aver = this.sum / 3f;
    }
  }


  public static void main(String[] args) {
    Score s = new Score("홍길동", 100, 100, 100);

    // 특정 항목에 대해 유효 범위를 넘어가는 값으로 변경
    s.kor = 120; //20 // 문법으로는 OK. but 작업은 무효하다.
    // 위 코드가 문법적으로는 문제가 없지만,
    // 유효한 명령인가? (프로그램의 목적에 부합한가)

    s.summary();
    s.average();
    //특정 항목의 값을 임의로 변경
    s.sum = 88; // 문법은 OK, 작업은 무효하다. (프로그램의 목적을 상실)
    // 위 코드가 문법적으로는 문제가 없지만,
    // 유효한 명령인가? (프로그램의 목적에 부합한가)
    //
    System.out.printf("%s, %d, %d, %d, %d, %f\n",
      s.name, s.kor, s.eng, s.math, s.sum, s.aver);
    }
}


/* 무효한 값을 설정할 때?
- 문법 상으로는 문제가 없지만,
  프로그램의 목적 또는 작업의 목적에는 부합하지 않는 경우 문제가 된다.
- 이런 문제가 발생한 이유?
  1) 인스턴스 변수에 임으적으로 접근할 때.
  2) 내부에서 사용되어야 할 명령어를 외부에서 사용할 때.
- 해결책 ?
  외부로부터 변수나 메서드에 대해 격리시키기.
  => 캡슐화(encapsulation)
- 캡슐화 격리 레벨
  1) private : 내부에서만 접근 가능 (같은 패키지에서도 접근 불가능)
  2) public : 완전 공개
  3) (default) (아무것두 안적을 때에~) : 같은 패키지에 소속된 클래스에서는 접근 가능
  4) protected : 같은 패키지 + 자식 클래스에서는 접근 가능 (-> 상속을 배운 후에 다시 알아보쟝)


*/
