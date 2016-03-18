/*주제 : 조건문 if */

package step05;

public class Exam02 {
  public static void main(String[] args) {
    // 조건문의 범위는 들여쓰기와 상관 없다.
    if (10 > 20) //조건이 참이면 한 문장을 실행한다.
      System.out.println("10>20");
      System.out.println("와~~정말?"); // if 문에 속해있지 않다.

    // 코드를 잘못해석하지 않게 들여쓰기(indent)를 잘 지켜라.
    if (10 > 20)
      System.out.println("10>20");
    System.out.println("와~~정말?"); // 들여쓰기 적용!

    // 실무에서는 코드의 명확성을 위해
    // 단 한 문장만 있더라도 블록({})으로 감싼다. ==> 구글 코딩 스타일
    if (10 > 20) {                            // if(10>20){  또는 { 를 밑에줄에 쓰지 않기
      System.out.println("10>20");
    }
      System.out.println("와~~정말?");





  }
}
