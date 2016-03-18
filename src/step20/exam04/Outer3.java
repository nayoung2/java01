// member inner class 사용하기
package step20.exam04;

public class Outer3 {
  int no = 20;
  int no = 1000;
  int ok = 1000;
  public void m1() {
    System.out.println(Outer3.this.no); // 이게 원칙
    System.out.println(/*Outer3.*/this.no); // 클래스명 생략 가능
    System.out.println(no); // 같은 이름은 갖는 로컬 변수가 없다면, this 생략 가능

    System.out.println("Outer3.m()....");
  }
  public void m2() {
  class Inner { // 메서드가 호출될 때 마다 클래스가 로딩되는 것 X
                // 클래스는 한 번만 로딩된다.
    int no = 100;
    public void test(int no) {
      System.out.println(no);
      System.out.println(this.no);
      System.out.println(this.ok); // 바깥 클래스의 인스턴스 변수에 접근하고 싶다.


    // 같은 이름을 가진 바깥 클래스의 인스턴스 변수에 접근하는 방법?
    // => 바깥클래스명.this.인스턴스변수
    System.out.println(Outer3.this.no);
    }
  }

  Inner p = new Inner();
  p.test(8888);
  }
}
