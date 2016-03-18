/* 주제: 스태틱 변수에 접근 */
package step12;

public class Exam02 {
  static int staticValue = 10;
  int instanceValue = 10;

  public void instanceMethod() {
    // 스태틱 변수는 클래스 이름으로 접근할 수 있다.
    Exam02.staticValue = 1000; // OK

    // 만약 메서드가 스태틱 변수와 같은 클래스에 있다면,
    // => 클래스명 생략 가능
    staticValue = 5000; // OK
    System.out.println("1");
  }


  static {
    Exam02.staticValue = 3000; //OK
    staticValue = 6000; //OK
    System.out.println("2");
  }

  public static void main(String[] args) {
    // Exam02.staticValue = 5000;// OK
    // staticValue = 2000;// OK
    System.out.println(Exam02.staticValue);
      System.out.println("3");

    Exam02 p = new Exam02();
    System.out.println("4");
    p.instanceMethod();
    System.out.println("5");
    System.out.println(Exam02.staticValue);
    System.out.println("6");
  }
}



/*
스태틱 블록 실행 순서
1) 클래스 로딩
2) 스태틱 변수 준비
3) 스태틱 변수의 초기화 문장(Line5) 실행
4) 스태틱 블록 실행




*/
