package step23.exam02;

public class HelloEn extends Hello {

  public String greet() { // 추상 메서드가 있는 추상클래스를 상속받았을 때, 추상메서드를 재정의 하지 않으면 컴파일 오류
    return "go Away!";
  }
}
