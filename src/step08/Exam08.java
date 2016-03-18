/*주제 : call by value */

package step08;

public class Exam08 {
  static void setValue(int a) { // 인스턴스는 메소드 테스트 하기 위해 생성자를 통해 인스턴스를 생성한 후에 메소드 호출이 가능하기 때문에 바로 호출이 가능한 static 메소드 사용
    a = 30;
  }
  public static void main(String[] args) { // stack에 args 메모리
    int a = 10;

    setValue(a); // 같은 클래스 내에선 앞에 클래스 이름 생략 가능

    System.out.println(a);

  }
}
/* call by value => cf 나눈나눈
- 메서드를 호출할 때 파라미터에 값을 넘긴다.
