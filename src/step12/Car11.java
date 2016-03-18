//final의 활용2 //메서드 앞 final
package step12;

public class Car11 {
/* => */ static final String model = "TICO";
  // 메서드 앞에 final을 붙인다.
  // => 하위 클래스에서 재정의 하지 못하도록 막는다. = 보안
  public final int plus(final int a, final int b) {
    return a + b;
  }
}
