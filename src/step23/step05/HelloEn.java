package step23;

// HelloEn 클래스는 Hello 규칙을 이행한다/따른다/실행한다.
// => 즉 Hello 규칙에 선언된 메서드를 만들 것이다라는 의미.
public class HelloEn implements Hello {
  @Override // 없어도 되지만 없으면 컴파일러 검사가 이루어지지 않는다.
  public String greet() {
    return "go Away!";
  }
}
