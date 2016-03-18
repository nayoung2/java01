/*주제 : 클래스 공용 변수 사용 */
//step06 메서드

package step07;

public class Exam02 {

  public static void main(String[] args) {
    // 1) 클래스 공용 변수 사용 전
    // => 2 * 3 + 6 - 7 = ?
    int a = Calculator.multiple(2, 3);
    a = Calculator.plus(a, 6);
    a = Calculator.minus(a, 7);
    System.out.println(a);

    // 2) 클래스 공용 변수 사용후
    Calculator2.result = 0; // 원래 0으로 초기화 되어있어 쓸 필요 없지만 여러번 사용할 때
                            //다른 값이 들어가 있을 수도 있기 때문에 초기화를 해줌
    Calculator2.plus(2);
    Calculator2.multiple(3);
    Calculator2.plus(6);
    Calculator2.minus(7);
    System.out.println(Calculator2.result);

  }
}
