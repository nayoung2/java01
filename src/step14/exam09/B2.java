package step14.exam09;

public class B2 extends A {
  float v4 = 3.14f;
  char v5;

  public B2() {
    // 수퍼 클래스에 기본 생성자 없을 때
    // 다른 생성자를 명시해야 한다.
    super("오호라"); // 이게 빠지면 기본 생성자 super(); 가 자동으로 들어감 => 수퍼 클래스에 기본 생성자가 없으니 오류!

    System.out.println("B2의 생성자--------");
    v1 = "김원봉";
    v3 = false;
    v5 = '가';

  }
}
