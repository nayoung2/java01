// 주제 : catch 다형성
package step19;

public class Test14 {
  static void m1(int i) throws AgeException {
    throw new AgeException();
  }


  static void m2(int i) throws ChildException {
    throw new ChildException();
}

  static void m3(int i) throws OldManException {
    throw new OldManException("예외입니다.");
  }


  public static void main(String[] args)  {
    try {
    m3(10);
// } catch (OldManException e) { // 정확하게 클래스 지정
// } catch (AgeException e) { // 상위 클래스 지정할 수 있다.
// } catch (Exception e) { // 더 상위 클래스 지정 가능.
   } catch (Throwable e) { // 더 상위 클래스 지정 가능.
// } catch (Object e) { // 오류! Throwable 까지만 가능하다.

    e.printStackTrace();
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
