// 주제: Collection API - 해시코드와 HashSet
package step21;

import java.util.HashSet;

public class Exam11 {

  static class Member /*extends Object*/{
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
    public int hashCode() {  // String 클래스의 hashCode()는 같은 문자열에 대해서 같은 해시코드를 리턴.
                            //  --------------------------
                            // Object의 hashCode()를 Exam10의 우리가 정의한 Member 클래스는 그대로 쓴다
                            // => 내용에 상관 없이 무조건 인스턴스가 다르면 다름 값 리턴
                            // String 클래스는 Object 클래스의 hashCode()를 재정의하여 사용
                            // => 내용이 같으면(같은 문자열이면) 같인 값 리턴
      return this.toString().hashCode(); // 위에서 재정의 한 대로 이름과 나이를 연결한 문자열을 얻고 그 문자열의 hashCode를 얻는다.
    }

    @Override
    public boolean equals(Object other) {
      if(other == null || other.getClass() != this.getClass()) { //getClass - 객체의 클래스를 리턴
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

  static void printList(HashSet<Member> list) {
    System.out.println("--------------------");
    for(Object value : list.toArray()) {        // HashSet이 get() 메서드를 갖지 않기 때문에.
      System.out.println(value);
    }
  }

  public static void main(String[] args) throws Exception {

    Member m1 = new Member("홍길동", 20);
    Member m2 = new Member("임꺽정", 30);
    Member m3 = new Member("유관순", 16);
    Member m4 = new Member("홍길동", 20);
    Member m5 = new Member("임꺽정", 30);

    System.out.printf("m1 = %d\n", m1.hashCode());
    System.out.printf("m2 = %d\n", m2.hashCode());
    System.out.printf("m3 = %d\n", m3.hashCode());
    System.out.printf("m4 = %d\n", m4.hashCode());
    System.out.printf("m5 = %d\n", m5.hashCode());
    System.out.printf("---------------------------");


    HashSet<Member> set = new HashSet<>();
    set.add(new Member("홍길동", 20));
    set.add(new Member("임꺽정", 30));
    set.add(new Member("유관순", 16));
    set.add(new Member("홍길동", 20)); // 저장 거부한다. 비록 인스턴스는 다르지만, 같다고 결론남.
    set.add(new Member("임꺽정", 30)); // 저장 거부다.ㅡㅡ. 비록 인스턴스는 //, 내용은 같음.

    printList(set);

  }
}


/*
# Member를 HashSet에 저장할 때 주의할 점!
- 같은 값을 같는 경우 중복저장하지 않도록 hashCode()와 equals()를
  재정의(overriding)하라!














Object => equals() : 인스턴스가 다르면 false --------------------------->
                                          ㄴ-------------Override-------> String.equals() : 인스턴스가 달라도 내용이 같으면 true

*/
