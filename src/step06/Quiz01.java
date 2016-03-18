/* 문제 : 두 개의 정수 값을 받아서 더한 결과를 리턴하는 메서드를 정의하시오.
        단, 메서드 이름은 add 이다. */

package step06;

public class Quiz01 {
  // 값도 받고 값도 리턴하는 메서드 정의하기
  static int add(int a, int b) {
    return a + b;
  }

  public static void main(String[] args) {
    System.out.println(add(10,20));
  }
}
