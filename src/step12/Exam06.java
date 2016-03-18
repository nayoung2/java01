/* 주제: 변수와 메서드 정리 - 생성자 사용 */
package step12;

public class Exam06 {
  public static void main(String[] args) {

    // Car2 c1 = new Car2(); // 오류 ! 기본생성자 불가능... 기본생성자가 없당
    Car3 c1 = new Car3("티코", "비트자동차", 2000, 5); // 인스턴스(model, maker, cc, capacity 묶음) 한 개 준비
    Car3 c2 = new Car3("그랜저", "비트자동차", 3000, 7);
    Car3 c3 = new Car3("코란도", "비트자동차", 3500, 2);
  }
}
