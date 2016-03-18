/*주제 : 다중 분기 switch */

package step05;

public class Exam06 {
  public static void main(String[] args) {
    int job = 3;    // 1 : 일반관리직, 2 : 운영팅, 3 : 개발
    switch (job) {
      case 1:
        System.out.println("오피스 자격증은 있니?");
        break;
      case 2:
        System.out.println("리눅스 자격증");
        break;
      case 3:
        System.out.println("자바 자격증");
        break;
      default:
        System.out.println("자격증 필요없음.");
    }
  }
}

//복잡한 분기에 대해 쓰기 위해서는 if~else를 쓰는게 낫다?
