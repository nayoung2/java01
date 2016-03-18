// 주제 : JVM 아규먼트
package step13;

public class Exam08 {
  public static void main(String[] args) {
    String name = System.getProperty("name");
    String age = System.getProperty("age");

    System.out.println(name);
    System.out.println(age);
  }
}


/*
JVM 아규먼트?
- 자바 프로그램을 실행할 때 JVM에 넘겨주는 값
- 예) java -cp bin -Dname=hong -Dage=18 step13.Exam17
  => name이라는 이름으로 hong 값을 전달한다.
  => age 라는 이름으로 16 값을 전달한다.
  (-D라는 옵션 뒤에 이름 = 값 형태로 준다 (-D[이름][값])

  값에 대해 이름을 부여하기 때문에 특정 이름의 값을 콕 찝어 추출할 수 있따.

  ~/workspace/java01 $ javac -d bin -sourcepath src src/step13/Exam08.java
  ~/workspace/java01 $ java -cp bin -Dname=hong -Dage=18 step13.Exam08
 hong
 18

*/






























/*

*/
