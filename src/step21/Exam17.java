// 주제: HashMap - entry set으로 값만 꺼내기
package step21;

import java.util.HashMap;
import java.util.Collection;
/* import static java.util.Map.Entry;  */

public class Exam17 {

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


    //맵에서 값 목록을 꺼낸다.
    Collection<Member> values = map.values(); // HashMap에서 value 타입을 Member로 설정했기 대문에 Collection도

    for (Member member : values) {
      System.out.printf("%s\n", member); //
    }

}
}


/*





















*/
