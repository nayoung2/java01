// 주제 : throws의 다형성
package step19;

public class Test13 {
  static void m1(int i) throws AgeException {
    throw new AgeException();
  }

  // throws 절에 상위 클래스를 지정할 수 있다.
  static void m2(int i) throws AgeException {
    throw new ChildException();
}

  static void m3(int i) throws Throwable {
    throw new ChildException("예외입니다.");
  }

  // 메서드에서 여러 개의 예외를 던질 때,
  // throws 절에 나열하라!
  static void m4(int i) throws ChildException, OldManException {
    if(i < 17)
      throw new ChildException();
    else
      throw new OldManException();
  }

  // 메서드에서 여러 개의 예외를 던질 때,
  // throws 절에 여러 예외의 상위 클래스를 명시할 수 있다.
  static void m5(int i) throws AgeException {
    if(i < 17)
      throw new ChildException();
    else
      throw new OldManException();
  }

  public static void main(String[] args)  {
    try {
    m1(50);
  } catch (Exception e) {
    e.printStackTrace();
    System.out.println(e.getMessage());
    }
  }
}

/*
# Exception의 의미
1) 예외가 발생할 수 있는 메서드에 대해서는
  명확하게 메서드 선언부에 명시함으로써
  개발자가 주의깊게 사용하도록 유도한다.
2) 최종적으로 호출된 메서드에서 예외가 발생할 경우,
  중간에 위치한 메서드들이 그 예외를 처리해야 하기 때문에
  코딩이 불편하다.
  목적 메서드 호출 중간에 위치한 메서드들이 많은 경우
  매번 예외처리를 해야 하기 때문에 코딩이 불편하다.
3) 그러나, 예외 처리를 강제함으로써 실행 안정성을 어느 정도
  확보할 수 있다.
*/
