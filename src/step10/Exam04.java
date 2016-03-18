/* 주제 : 캡슐화 적용 후 2
  * 셋터 메서드 사용
  */

package step10;

public class Exam04 {
  public static void main(String[] args) {
    Score3 s = new Score3 ("홍길동", 100, 100, 100);

    //셋터를 이용하면 인스턴스를 생성한 후에도 값을 변경할 수 있다.
    // 또한 setter 내부에서 값을 저장하기 전에 유효 여부를 검사한다.
    // => 무효한 값이 저장되는 것을 막을 수 있다.
    // => 이것이 셋터의 존재이유이다.
    s.setKor(120);  // <------ 무효한 점수(점수가 100점을 넘음)이기 때문에 값을 넣지 않는다.
    s.setKor(50); // <-------- 50은 유효한 값이기 때문에 저장될 것이다.
    //
    s.summary();
    s.average();

    System.out.printf("%s, %d, %d, %d, %d, %f\n",
     s.getName(), s.getKor(), s.getEng(), s.getMath(),
     s.getSummary(), s.getAverage());
    }
}


/*  격리 레벨을 높이면 값을 꺼낼 수 없다.
- 해결책?
  값을 넣고 꺼내주는 연산자를 추가하라!
- 값을 꺼내는 연산자 => 겟터(getter)
  int getKor() {} ==> getXxxx() => get으로 시작하는것이 규칙!
- 값을 저장하는 연산자 => 셋터(setter)
 void
*/

/* 개선점 ?
- 현재 Score는 인스턴스를 생성할 때 값을 저장할 수 있다.
- 인스턴스를 생상한 후에는 값을 변경할 수 없다.
- 왜 ? 모든 변수가 private으로 접근 레벨이 높아졌기 때문이다.
- 해결책? 값을 설정해주는 연산자를 추가하라!
  => 셋터 추가!
  => Exam04.java
  */
