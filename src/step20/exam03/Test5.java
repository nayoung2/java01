// 주제 : member inner class 사용
// => 인스턴스 중첩 클래스
package step20.exam03;

public class Test5 {
  public static void main(String[] args) {
    Outer3 p = new Outer3();
    p.no = 20;
    p.m();

    // 레버런스를 선언하는 방법은 top level inner 클래스와 같다.
    // 그러나 인스턴스를 생성하는 문법은 다르다.
    // => 인스턴스.new [중첩클래스]();
    Outer3.Inner p2 = p.new Inner(); // 쓸 경우가 거의 없다. (member inner class는 밖에서 사용하지 않을 때 만든다..)
                                    // 외부에서 쓸 경우엔 static(top level inner class)으로 만들자...
    p2.m2();

  }
}

/*

*/
