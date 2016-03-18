package test01;
/*
2 * 5 - 3 = ?
3 - 7 + 5 = ?
*/

public class Exam03 {
  public static void main(String[] args) {
    Calculator3 calc1;
    Calculator3 calc2;
    calc1 = new Calculator3();
    calc2 = new Calculator3();

    Calculator3.plus(calc1, 2);
    Calculator3.plus(calc2, 3);

    Calculator3.multiple(calc1, 5);
    Calculator3.minus(calc2, 7);

    Calculator3.minus(calc1, 3);
    Calculator3.plus(calc2, 5);

    System.out.println(calc1.result);
    System.out.println(calc2.result);

    //

  }
}
