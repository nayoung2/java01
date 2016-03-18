// 주제 : 상속
package step14;

public class Exam01 {
  public static void main(String[] args) {
    // 기존 클래스 사용 계산 (연산자 우선순위를 고려하지 않는다.)
    // => 2 * 3 + 7  = ?
    Calculator calc = new Calculator();
    calc.plus(2);
    calc.multiple(3);
    calc.plus(7);
    System.out.println(calc.result);
    System.out.println("----------------------");
    // => 2 * 3 + 7 % 3 = ?
    // 나머지를 구하는 메서드는 없기 떄문에
    // 기존 클래스로 계산할 수 없다.

    // => 2 * 3 + 7 % 3 = ? 을 연산하기 위해선 % 계산하는 메소드를 추가해야 한다.
    // 하지만 소스코드가 주어지지 않고 클래스 파일만 주어진 경우...? (Calculator의 소스파일 없움)
    //( 예를들어 다른 사람이 작성한 코드의 클래스 파일만 가져와 사용할 때)

    // ~/workspace/java01 $ javac -cp libs/calc.jar -d bin -sourcepath src src/step14/Exam01.java
    //~/workspace/java01 $ java -cp bin:libs/calc.jar step14.Exam01
    //                             ------------------
    //                               classpath - bin에서 class 파일을 찾아보고 없으면 libs으로 가서 찾음
    //                                    ==> jar파일은 폴더 뿐만 아니라 jar파일을 지정해주어야함
    //                                      (windows 는 : 대신 ;)


    // 기존 클래스의 기능을 확장한 서브 클래스를 사용한다.
    Calculator2 calc2 = new Calculator2();
    calc2.plus(2);
    calc2.multiple(3);
    calc2.plus(7);
    calc2.remainder(3);
    System.out.println(calc2.result);
  }
}

// ~/workspace/java01 $ javac -cp libs/calc.jar -d bin -sourcepath src src/step14/Exam01.java
// ~/workspace/java01 $ java -cp bin:libs/calc.jar step14.Exam01
//13
// 1






/* 상속
- 기존 클래스의 기능을 확장하는 문법
- 이점
    => 기존 코드의 재사용.  (새로 작성하지 않고)
    => 기존 코드를 손대지 않기 때문에 새 기능 추가에 따른 위험도가 덜하다.
    => 기능 확장이 쉽다.

- 종류
    => 수퍼 클래스에서 하위 클래스로 확장하는 것을 "specialization"이라 부른다.
    => 서브 클래스들의 공통점을 뽑아서 수퍼 클래스로 정의하는 것을
      "generalization"이라 부른다. // 초보자들은 이러한 방법이 더 나을 것...?


*/
