// 주제: HashMap - entry set으로 데이터 꺼내기 2
package step21;

import java.util.HashMap;
import java.util.Set;
import java.util.Map;
/* import static java.util.Map.Entry;  */

public class Exam16 {

  static class Member {
    String name;
    int age;
    public Member(String name, int age) {
      this.name = name;
      this.age = age;
    }

    @Override
    public String toString() {
      return name + ", " + age;
    }

    @Override
    public int hashCode() {
      return this.toString().hashCode();
    }

    @Override
    public boolean equals(Object other) {
      if(other == null || other.getClass() != this.getClass()) {
        return false;
      }
      Member m = (Member)other;

      if (!this.name.equals(m.name)) { //문자열
        return false;
      }
      if (this.age != m.age) {
        return false;
      }
      return true;
    }
  }

  public static void main(String[] args) throws Exception {
    Member m1 = new Member("홍길동", 20);
    Member m2 = new Member("임꺽정", 30);
    Member m3 = new Member("유관순", 16);

    HashMap<String,Member> map = new HashMap<>();
    map.put("aaa", m1);
    map.put("bbb", m2);
    map.put("ccc", m3);

    Set<Map.Entry<String,Member>/*Entry -> Entry가 어느 소속인지 헷갈릴 수 있다.*/> entrySet = map.entrySet(); // 리턴 값 : [키-값]의 목록
    // entrySet에 들어있는 객체들은 Entry 타입의 객체이다. // (타입 : 클래스, 인터페이스의 통칭) // Map이 클래스 => Map.Entry - top level inner class (static) (인터페이스지만 일단 이렇게 알고있자)
    // => Entry 타입이 java.util 패키지에 있는지 찾아보라!
    // => Entry ? Map 인터페이스의 중첩 인터페이스다.
    // Set에 어떤 타입의 객체가 들어있는지 선언했기 때문에
    // 다음과 같이 변수의 타입을 지정할 수 있다. (Map.Entry으로)
    for (Map.Entry<String,Member> entry : entrySet) {
      // 위와 같이 항목의 타입을 정확히 지정하면,
      // 그 타입의 메서드를 마음놓고 사용할 수 있다. (Entry는 getKey(), getValue() 등의 메서드를 갖는다)
      System.out.printf("%s - %s\n", entry.getKey(), entry.getValue()); //
    }
/*  Exam15
    Set entrySet = map.entrySet(); // => Set에 들어갈 타입 설정 X => Object
    for (java.util.Map.Entry entry : entrySet) {  // => 불가능
      System.out.println(entry);
  }
*/
}
}


/*





















*/
