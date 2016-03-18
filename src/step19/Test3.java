// 주제 : 예외 처리 후

package step19;

public class Test3 {
  public static void main(String[] args) {
    Calculator1 calc = new Calculator1();
    calc.plus(10);

    // 예외 상황을 일으킬 수 있는 코드를
    // try {} 블록 안에 둔다
    // 예외 상황을 처리하는 코드를
    // catch (예외타입) {} 블록 안에 둔다
    try{
    calc.divide(0);
    System.out.println("----------------");
    System.out.println(calc.result);
    System.out.println("----------------");
  } catch (/*java.lang.*/ArithmeticException e) {
    System.out.println("나누기 오류 발생!");
    System.out.println(e.getMessage()); // 간단한 오류 정보 //java.lang.Throwable 의 메서드
    System.out.println("----------------------");
    e.printStackTrace(); // 완전한 오류 정보 - 마지막에 호출 된 메서드부터 역추적해가며 오류를 찾아낸다.
  //  -----
    }
  }
}






/*

Class ArithmeticException

java.lang.Object
java.lang.Throwable
java.lang.Exception
java.lang.RuntimeException
java.lang.ArithmeticException











*/
