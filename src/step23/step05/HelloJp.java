package step23;

import java.util.Calendar;
import java.util.ArrayList;

public class HelloJp extends ArrayList<String> implements Hello { // => implements Hello 했지만 Hello의 규칙 따르지 않음(greet() 존재X) => 컴파일 오류!
  public HelloJp() {
    this.add("こんにちは。");
    this.add("こんばんは。");
  }

  @Override
  public String greet() {
    return this.sayHello(); // 기존 메서드를 손대지 않는다.
  }

  public String sayHello() {      // 다른 개발자의 프로그램에서 이 메서드를 사용하는 경우,
                                  // 이 메서드 이름을 고치면 그 프로그램은 쓸 수 없다 ㅠㅠ
    Calendar cal = Calendar.getInstance();
    int hour = cal.get(Calendar.HOUR);
    if (hour < 18) {
      return this.get(0);
    } else {
      return this.get(1);
    }
  }


}







/*




*/
