// 주제 : 왜 상위 클래스의 레퍼런스는 하위 클래스의 인스턴스를 가리킬 수 있는가?

package step15.exam02;

public class Test3 {
  public static void main(String[] args) {
    // 만약 하위 레퍼런스로 상위 클래스의 인스턴스를 가리킬 수 있다면?
    Member s1 = new Member();  //  Parent <= Child (항상 기능이 같거나 더 많다). 이건 허용
    s1.id = "hong";
    s1.password = "1111";


    // s1은 Member 인스턴스를 가리킨다.
    // => 그런데 다음과 같이 s1이 가리키는 것이 student라고 속이고
    //    형변환한다면 컴파일러는 속는다.
    //    그러나 실행할 때 오류 발생한다.
    Student s2 = (Student)s1;
    s2.isWorking = true;
    // ((Student)s1).isWorking = true; // 위 코드의 단축 코드이다.
  }
}
