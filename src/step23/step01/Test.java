// 주제 : 인터페이스 사용 전
// 언어 별로 인사말을 생성해주는 클래스를 사용하여,
//    인사말을 출력하는 프로그램을 작성한다.
// => 한국어와 영어로 인사말을 생성하는 클래스를 작성한다.
//    한국어: HelloKo
//    영어 : HelloEn

package step23;

public class Test {
  public static void main(String[] args) {
    //JVM 옵션 : -Dlang=값
    // 값 => en,ko
    // null => ko
    String lang = System.getProperty("lang");

    String message = null;
    // Object obj; => Object에는 greet() 메서드가 존재하지 않음 => obj로는 greet() 메서드를 호출할 수 없다.
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
