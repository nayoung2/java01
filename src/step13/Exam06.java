// 주제 : mutable(변경 가능한) 문자열 다루기
package step13;

public class Exam06 {
  public static void main(String[] args) {
    String str1 = new String("Hello");
    String r1 = str1.concat(", World!"); // 새 문자열 인스턴스 리턴 => 원본이 바뀌지 않음
    if (str1 == r1) {
      System.out.println("str1 == r1");
    }
    else {
      System.out.println("str1 != r1");
    }

      System.out.println(str1);

    StringBuffer str2 = new StringBuffer("Hello");
    StringBuffer r2 = str2.append(", World!");  // 기존 인스턴스 리턴 => 원본이 바뀜
    if (str2 == r2) {
      System.out.println("str2 == r2");
    }
    else {
      System.out.println("str2 != r2");
    }

    System.out.println(str2);
  }
}
// thread - lock // thread safe
// StringBuffer는 thread safe
// 데이터를 만지고 있을 때 작업이 다 끝나고 lock을 풀 때 까지 다른 곳에서(?) 데이터를 건드리지 못한다.


/*
mutable vs immutable?
1) mutable : 인스턴스의 데이터가 변경되는 것.
- StringBuffer(thread safe), StringBuilder(동기화 비 보증)
2) immutable : 인스턴스가 한 번 생성되면 값을 바꿀 수 없다.
- String
*/
