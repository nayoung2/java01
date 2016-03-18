// 주제 : top level inner class 사용2
package step20.exam03;

public class Test3 {
  public static void main(String[] args) {
    // top level inner class의 인스턴스 생성하기
    Outer2.Inner p = new Outer2.Inner();
    p.m2(); // m2() - 인스턴스가 있어야지만 호출할 수 있는 메서드


  }
}

/*

*/
