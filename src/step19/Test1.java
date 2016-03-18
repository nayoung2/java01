// 주제 : 예외 처리 전

package step19;

public class Test1 {
  public static void main(String[] args) {
    Calculator1 calc = new Calculator1();
    calc.plus(10);
    calc.divide(0); // 계산 오류 발생!
            //JVM의 대응?
            // => 예외 상황을 보고하고, 즉시 실행을 멈춘다.
    System.out.println("----------------");
    System.out.println(calc.result);
    System.out.println("----------------");
  }
}

/*
~/workspace/java01 $ javac -d bin -sourcepath src src/step19/Test1.java
~/workspace/java01 $ java -cp bin step19.Test1
Exception in thread "main" java.lang.ArithmeticException: / by zero
 at step19.Calculator1.divide(Calculator1.java:19)
 at step19.Test1.main(Test1.java:9)

  예외 상황에 대한 JVM의 태도
- 개인 프로그램인 경우 즉시 실행을 멈춰도 상관없다.
- 서비스 같은 여러 사용자가 동시에 사용하는 공용 프로그램인 경우
  실행을 멈추는 것은 매우 치명적인 상황이 된다.
- 해결책?
  => 개발자가 예외 상황을 다룰 수 있는 문법을 제시.
  => 예외 처리 문법이 등장!
*/
