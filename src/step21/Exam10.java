// 주제: Collection API - 해시코드와 HashSet
//=> hashcode(), equals() 재정의 전 - 중복된 데이터 저장됨
package step21;

import java.util.HashSet;

public class Exam10 {

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


    HashSet<Member> set = new HashSet<>(); // 중복 제거, 해시코드의 순서대로 출력.
    set.add(new Member("홍길동", 20));
    set.add(new Member("임꺽정", 30));
    set.add(new Member("유관순", 16));
    set.add(new Member("홍길동", 20)); // 저장된다.
    set.add(new Member("임꺽정", 30)); // 저장된다.

    printList(set);

  }
}


/*
# HashSet이 데이터를 저장하는 방법
- 값을 저장하기 전에 기존에 저장된 객체 중에 같은 값을 가진 객체가 있는지
  검사한다.
  => 검사 방법?
    1) hashcode()의 값을 비교
    2) 해시값이 같으면 한 번 더 equals()로 값을 비교한다.
    => equals() 마저 같다고 나오면 중복 데이터로 간주하여 저장하지 않는다.

















~/workspace/java01 $ javac -d bin -sourcepath src src/step21/Exam10.java
~/workspace/java01 $ java -cp bin step21.Exam10
--------------------
홍길동, 20
임꺽정, 30
임꺽정, 30
홍길동, 20
유관순, 16



AbstractCollection
  ㄴArrayList                    ㄴHashSet
  인덱스로 관리                   해시값으로 관리

toArray() : 갖고있는 값들을 배열로 만들어 리턴해줌.


*/
