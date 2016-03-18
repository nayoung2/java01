// 주제 : 다형적 변수에서 메서드 호출

package step15.exam02;

public class Test4 {
  public static void main(String[] args) {
    // 만약 하위 레퍼런스로 상위 클래스의 인스턴스를 가리킬 수 있다면?
    // Member s1 = new Member(); => Member의 printInfo 호출
    Member s1 = new Student();  //  Parent <= Child (항상 기능이 같거나 더 많다). 이건 허용    => Student의 printInfo 호출
    s1.id = "hong";
    s1.password = "1111";
    //((Student)s1).isWorking = true; // 컴파일러에게 s1은 Student를 가리키는 주소라고 알림 => Student에는 isWorking이 있으니 컴파일러 통과

    // 하위 클래스의 인스턴스를 가리키는 레퍼런스를 가지고
    // 메서드를 호출한다면, 다은 규칙에 따라 실행한다.
    // => 하위 클래스가 해당 메서드를 오버라이딩 했는가?
    //   yes: 그 오버라이딩 메서드를 호출한다.
    //    no: 레퍼런스 클래스의 메서드를 호출한다.
        s1.printInfo(); // <--- 실제 인스턴스 클래스의 메서드 : Student.printInfo();
  }
}
