// 주제 : HelloJp 처럼 이미 다른 클래스를 상속 받는 경우 해결책!
// => 기존에 상속 받는 클래스 대신 AbstractHello를 상속 받게 한다.
//    그리고 기존에 상속받았던 기능은 다른 방식으로 처리한다.
// => HelloJp 클래스 개편!
//
// # 문제점
// => 그나마 HelloJp처럼 클래스의 크기가 작을 때는 소스 코드 개편이 가능하지만,
//    실무에서는 이렇게 간단치가 않다.
//    기존의 클래스를 상속 받은 후 많은 코드가 추가된 경우에는,
//    HelloJp처럼 기존 상속을 포기할 수 없다.

package step23;

public class Test {
  public static void main(String[] args) {

    String lang = System.getProperty("lang");

    String message = null;
    AbstractHello obj = null; // 작업순서 2).  레퍼런스로 변수를 이용하여
      // 인사말을 리턴할 객체의 타입을 한정한다. (Hello의 서브클래스만 가능!)
    if("en".equals(lang)) { //** NullPointException이 뜨지 않음 (lang.equals("en")은 lang이 null인 경우가 있다)
        obj = new HelloEn();
      } else if ("jp".equals(lang)) {
      obj = new HelloJp(); // 새로 개편은 HelloJp 사용하기
      } else {
        obj = new Hello();
      }
      //어떤 객체인진 모르겠지만, 그 객체는 Hello의 서브 클래스이기 때문에
      //반드시 greet()라는 메서드가 있을 것이다.
      // => 바로 이것이 상속을 이용한 호출 규칙을 제한하는 방법이다.
      message = obj.greet();  //obj => AbstractHello타입 => greet()메서드를 가진다.
      System.out.println(message);
    }
  }
// ~/workspace/java01 $ java -cp bin -Dlang=en step23.exam01.Test
