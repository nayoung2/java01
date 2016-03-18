package test01;
/*
2 * 5 - 3 = ?
*/

public class Exam01 {
  public static void main(String[] args) {
      int a = Calculator.multiple(2, 5);
      a = Calculator.minus(a, 3);
      System.out.println(a);
  }
}
