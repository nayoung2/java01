/* 주제 : 연산자 우선순위와 후위 연산자 */

package step04;

public class Exam13 {
  public static void main(String[] args) {
    int i = 3;
    int r = i++ + i++ * i++;
    System.out.println(r);

    /* 실행순서

    r = 3 + 4 * 5;
    r = 3 + 20
    r = 23          => O
    결론 => *, /, % 보다 후위 연산자(++, --)가 우선한다.


    //헷갈릴 수 있는 내용///
    r = i++ + 3 * 4
    r = 5 + 3 * 4
    r = 17  => X 아닙니당
    */

    }
  }

/*






*/
