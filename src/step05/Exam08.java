/*주제 : 다중 분기 switch(3)*/

package step05;

public class Exam08 {
  public static void main(String[] args) {
    int job = 2;    // 1 : 일반관리직, 2 : 운영팅, 3 : 개발
    switch (job) {
      case 3:
        System.out.println("자바 자격증");

      case 2:
        System.out.println("리눅스 자격증");

      case 1:
        System.out.println("오피스 자격증은 있니?");
        break;

      default: // 가능하면 defalt를 만들기 (구글 스타일)
        System.out.println("자격증 필요없음.");
    }

    // 명령을 겹쳐서 실행하고 싶을 때 break를 사용하지 않을 수 있다.
  }
}
