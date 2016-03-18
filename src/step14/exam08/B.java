package step14.exam08;

public class B extends A {
  float v4 = 3.14f;
  char v5;

  public B() {

    System.out.println("B의 생성자------------------------------");
    super(); // 오류! 수퍼 클래스 생성자 호출은 무조건 첫 번째 문장이어야 한다. (위에 한 줄이라도 있으면 안된다.)
    //src/step14/exam08/B.java:10: error: call to super must be first statement in constructor
    v1 = "김원봉";
    v3 = false;
    v5 = '가';

  }
}
