/* 주제: 생성자 오버로딩 사용 */
package step12;

public class Exam07 {
  public static void main(String[] args) {

    Car4 c1 = new Car4("티코", "비트자동차", 2000, 5); // 인스턴스(model, maker, cc, capacity 묶음) 한 개 준비
    Car4 c2 = new Car4("그랜저", "비트자동차", 3000, 7);
    Car4 c3 = new Car4();

    c3.model = "코란도";
    c3.maker = "비트자동차";
    c3.cc = 3500;
    c3.capacity = 2;
  }

}
