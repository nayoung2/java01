package step24.exam05;

public class Test implements A, B {
  public void m1() {
    // 인터페이스의 모든 필드는 public static final 이다.
    //WOMAN = 20; // 컴파일 오류! (error: cannot assign a value to final variable WOMAN)
    System.out.println(A.WOMAN);  // static 이기 때문에 인터페이스 이름으로 사용
    System.out.println(WOMAN);  // 구현 클래스(Test)에서는 인터페이스 이름 생략 가능! OK

    //System.out.println(MAN);  // 컴파일 오류! A의 MAN과 B의 MAN을 구분할 수 없다.

    // 구현한 인터페이스에 동일한 이름의 변수가 있을 때는
    // 인터페이스 이름을 명시하여 명확하게 구분해야 한다.
    System.out.println(A.MAN); // OK
    System.out.println(B.MAN); // OK
    System.out.println("m1()...");
  }

  public static void main(String[] args) {
    Test p = new Test();
    p.m1();
  }
}

/*
추상클래스 -> 추상메서드 뿐만 아니라 일반 메서드, 필드를 물려줄 수 있음
인터페이스 -> 일반메서드 불가.

추상클래스 -> 추상메서드 뿐만 아니라 일반 메서드, 필드를 물려줄 수 있음
인터페이스 -> 일반메서드 불가.

*/
