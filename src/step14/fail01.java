//주제 : 상속

// 오류
// package step14;
//
// public class Exam01 {
//   public static void main(String[] args) {
//     // 기존 클래스 사용
//
//   Calculator4 clac = new Calculator4();
//   }
// }

package step14;

import step07.Calculator4;

public class Exam01 {
  public static void main(String[] args) {
    // 기존 클래스 사용 계산
    // => 2 * 3 - 7 = ?
    Calculator4 clac = new Calculator4();
    // import 안해주면   step07.Calculator4 clac = new step07.Calculator4();
    calc.plus(2);
    calc.multiple(3);
    calc.minus(7);
    System.out.println(calc.result);
  }
}

// => step07의 Calculator의 메서드들이 public이 아니라서 쓸 수 없다 ㅠ
//  Exam01과 Calculator를 새로 만들어준다..
