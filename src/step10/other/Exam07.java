/* 주제 : 다른 패키지의 클래스 사용 및 클래스 접근 레벨 */
package step10.other;

import step10.Score5;  // Score5의 소속을 컴파일러에게 알린다.
                      // 컴파일 후에 제거되는 명령문이다. -> 길어져도 괜찮다! 그러니까 와일드카드는 쓰지 않도록..
                      // => import 문의 개수가 많다고 걱정하지 말라!

public class Exam07 {
  public static void main(String[] args) {
    // 방법 1) 정확하게 패키지 이름까지 적으면 된다.
    //step10.Score5 s = new step10.Score5 ("홍길동", 100, 100, 100); //Score5 is not public in step10; cannot be accessed from outside package 하위패키지/상위패키지의 개념이 X. 서로 다른 패키지! Score5가 public이 아닌 default

    // 방법 2) import를 사용하여 패키지 정보를 미리 알려준다.
    Score5 s = new Score5 ("홍길동", 100, 100, 100);

    s.setKor(50);

    System.out.printf("%s, %d, %d, %d, %d, %f\n",
     s.getName(), s.getKor(), s.getEng(), s.getMath(),
     s.getSummary(), s.getAverage());
    }
}


/*  다른 패키지 클래스 사용법
방법 1) 클래스 이름 앞에 패키지 이름을 모두 적어라.
방법 2) 패키지 선언 아래에 클래스의 패키지 정보를 등록한다.
  => import step10.Score5;
  => impotr step10.*;     <---------- 비추! 클래스의 소속을(소속 패키지를) 직관적으로 알 수 없다. => 유지보수에 좋지 않다.

컴파일할 때 오류 발생?
- Score5의 클래스의 접근 레벨이 default이기 때문이다.
- default는 오직 같은 패키지에 소속된 클래스만이 접근할 수 있다.
- Exam05는 Score5와는 다른 패키지에 소속되었기 때문에
  Score5의 생성자를 실행할 수 없다.

- 해결책?
  Score5의 클래스의 접근 레벨을 public으로 공개하면 된다.
  => Exam06.java와 Score6.java 참조!
*/
