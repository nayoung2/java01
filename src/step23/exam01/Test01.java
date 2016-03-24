// 주제 : 인터페이스 사용 전
// => 규칙이 없기 때문에 클래스를 만드는 사람마다,
//    제각각으로 메서드를 만들 것이다.
// => 그러면 그 클래스를 사용하는 개발자는 항상 클래스의 메서드 형식을
//    살펴서 호출해야한다. --> 너무 번거롭다.
// => 해결책?
//    --> 호출 규칙을 정의하라!

package step23.exam01;

public class Test {
  public static void main(String[] args) {
    //JVM 옵션 : -Dlang=값
    // 값 => en,ko
    // null => ko
    String lang = System.getProperty("lang");

    String message = null;
    Hello obj1 = new Hello();
    if("en".equals(lang)) { //** NullPointException이 뜨지 않음 (lang.equals("en")은 lang이 null인 경우가 있다)
      HelloEn obj = new HelloEn();
      message = obj.greet();
    } else {
      Hello obj = new Hello();
      message = obj.greet();
    }

    System.out.println(message);
  }
}


// ~/workspace/java01 $ java -cp bin -Dlang=en step23.exam01.Test
