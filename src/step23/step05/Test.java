// 주제 : 인터페이스를 이용한 호출 규칙 정하기
// => AbstractHello 처럼 서브 클래스에게 상속해 줄 것도 없는 경우,
//    단지 호출 규칙만 정의할 필요가 있는 경우,
//    ---> 인터페이스 문법을 사용하라!
/*
  # 인터페이스
=> 사용객체와 피사용객체 사이의 호출 규칙을 정의할 때 사용하는 문법이다.
=> 클래스의 구현 규칙을 정의함으로써, 잘못 된 구현을 방지할 수 있다.
=> 호출할 메서드의 시그너처가 정의되었기 때문에,
  일관된 프로그래밍이 가능하다.
=> 인터페이스를 구현한 어떤 클래스든 간에 그 자리를 대체할 수 있다.
  --> 코드 대체가 쉽다.
=> 반드시 추상 메서드만 선언해야 한다.
=> 규칙이기 때문에 모든 멤버는 공개되어야(public이어야) 한다.
  모든 메서드는 public abstract 이다.
=> 직접 인스턴스를 생성하는 것이 아니기 때문에,
  모든 필드는 public static final 이다.

# 추상 클래스
=> 추상 클래스는 서브 클래스의 공통 필드나 메서드를 상속해주기 위한 용도이다.
=> 추상 클래스에서 추상 메서드의 의미는,
  서브 클래스에게 메서드의 구현을 강제하는 문법일 뿐이다.
(추상 클래스 ---> 클래스가 다른 클래스를 상속받고 있는 경우, 추상클래스를 상속받을 수 없다..)
(인터페이스 ---> 클래스가 자격만 갖췄다면~~~~~가능!!)
*/

package step23;

public class Test {
  public static void main(String[] args) {

    String lang = System.getProperty("lang");

    String message = null;
    // 아 놀래라! 아니 인터페이스 레퍼런스라니?!
    // => 인터페이스의 레퍼런스 obj는 Hello 인터페이스의 인스턴스를 담는 것이 아니다.
    //     아니, 인터페이스의 인스턴스를 만들 수 없지 않은가.
    // => obj 레퍼런스는 Hello 규칙을 따르는 클래스의 인스턴스를 담을 수 있다.
    //    짧게 줄여서 표현하면 Hello 구현체를 저장하겠다.
    Hello obj = null;

    if("en".equals(lang)) {
        obj = new HelloEn(); // HelloEn은 Hello의 구현 클래스이다.
      } else if("jp".equals(lang)){
        obj = new HelloJp();      //  HelloJp은 Hello의 구현 클래스이다.
      }
      else {
        obj = new HelloKo(); //  HelloKo는 Hello의 구현 클래스이다.
      }

      // Hello 규칙에 정의된 대로 메서드를 호출한다.
      message = obj.greet();  //obj => AbstractHello타입 => greet()메서드를 가진다.
      System.out.println(message);
    }
  }
// ~/workspace/java01 $ java -cp bin -Dlang=en step23.exam01.Test
