/*주제 : 조건문 if ~ else 중첩 */

package step05;

public class Exam04 {
  public static void main(String[] args) {

    int age = 30;
    if (age <= 13)
      System.out.println("아동");
    else  // if ~ else ~ 는 한 명령문이기 때문에 블록을 사용할 필요가 없다.
      if (age <= 18)
        System.out.println("청소년");
      else
        System.out.println("성인");

    // 위와 같이 하는 것이 정상적인 방법이지만,
    // 코드를 읽기 편하게 만들기 위해 보통 다음과 같이 코드를 정렬한다.
    if (age <= 13)
      System.out.println("아동");
    else if (age <= 18)   //  else if라는 문법은 존재하지 X. else에 속해있는 if를 당겨쓴것 뿐. => if~else~는 갈래가 두개 뿐!
      System.out.println("청소년");
    else
      System.out.println("성인");



  }
}
