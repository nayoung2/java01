// 주제 : 프로그램 아규먼트
package step13;

public class Exam07 {
  public static void main(String[] ohora) { // String[] 타입이 주요한거지 변수 명은 상관 X. (args가 아니어도 된다.)
    System.out.println(ohora.length);
    System.out.println("---------------");
    for (String value : ohora) {
      System.out.println(value);
    }

  }
}


/*
프로그램 아규먼트?
- 자바 프로그램을 실행할 때 넘겨주는 값
- 예) java -cp bin step13.Exam17 aaa bbb ccc ddd
  => aaa bbb ccc ddd 가 프로그램 아규먼트이다.
  => 공백을 기준으로 문자려 잘라 배열로 만들어 리턴한다.



  ~/workspace/java01 $ java -cp bin step13.Exam07
0
---------------
~/workspace/java01 $ java -cp bin step13.Exam07 aaa bbbb ccc dddddd
4
---------------
aaa
bbbb
ccc
dddddd

*/






























/*

*/
