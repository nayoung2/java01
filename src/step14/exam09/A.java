package step14.exam09;

public class A {
  String v1 = "홍길동"; // 변수선언 + 초기화 문장
  int v2 = 10;  // 변수 선언 + 초기화 문장
  boolean v3; // 변수 선언

// A 클래스에는 기본 생성자가 없다.
    public A(String name) {
      //super(); // 명시적으로 집어넣는것도 가능.
      System.out.println("A(String)의 생성자-----------");
      v1 = name; // 생성자안에 v1이라는 변수가 없음 -> v1 변수를 찾음 -> 인스턴스 변수라는걸 알 수 있음. this 생략
    }

}
