// anonymous inner class 선언
package step20.exam03;

public class Outer5 {
  int no;

  // annoymous inner class - member
  // => new [수퍼클래스|인터페이스](수퍼클래스생성자의파라미터, ...) {선언};
  Object obj1 = new Object() {}; // Object의 하위 클래스
  Object obj2 = new Object() {}; // Object의 하위 클래스
  Object obj3 = new Object() {}; // Object의 하위 클래스

  void m() {
    System.out.println(obj1);
  }
}

/*
# 중첩 클래스와 .class 파일
- 자바 컴파일러는 클래서 선언 당 한 개의 .class(bytecode) 파일을 생성한다. 
- 중첩 클래스의 경우 "바깥클래스명$중첩클래스명.class" 형식으로
  클래스 파일을 만든다.
- 익명 중첩 클래스는 "바깥클래스명$1.class"처럼 $ 다음에 선언된 순서대로
  번호가 붙는다.

*/












// Outer5$1
// Outer5$2
// Outer5$3
// 클래스 명이 없기때문에 1부터 순차적으로 번호가 붙어서 class파일 생성
