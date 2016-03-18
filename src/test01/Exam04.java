package test01;
/*
2 * 5 - 3 = ?
3 - 7 + 5 = ?
*/
//매번 인스턴스 변수의 주소값을 파라미터로 받아주기 귀찮음! ---> 인스턴스 메소드 사용!

public class Exam04 {
  public static void main(String[] args) {
    Calculator4 calc1 = new Calculator4();
    Calculator4 calc2 = new Calculator4();

    calc1.plus(2);  //여기에 준 인스턴스 변수의 주소가 (calc1) this 변수에 자동으로 들어간닷!
    calc2.plus(3);

    calc1.multiple(5);
    calc2.minus(7);

    calc1.minus(3);
    calc2.plus(5);

    System.out.println(calc1.result);
    System.out.println(calc2.result);

    //

  }
}
