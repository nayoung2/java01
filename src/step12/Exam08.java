/* 주제: 캡슐화 적용 */
package step12;

public class Exam08 {
  public static void main(String[] args) {

    // Car2 c1 = new Car2(); // 기본생성자 불가능... 기본생성자가 없당
    Car5 c1 = new Car5("티코", "비트자동차", 2000, 5); // 인스턴스(model, maker, cc, capacity 묶음) 한 개 준비
    Car5 c2 = new Car5("그랜저", "비트자동차", 3000, 7);
    Car5 c3 = new Car5();
    /* 직접 변수에 접근 불가능. 메소드를 통해서만 값을 저장할 수 있다.
    c3.model = "코란도";
    c3.maker = "비트자동차";
    c3.cc = 3500;
    c3.capacity = 2;
    */

    c3.setModel("코란도");
    c3.setMaker("비트자동차");
    c3.setCc(3500);
    c3.setCapacity(-30);  // 잘못 된 값을 넣었을 때

    System.out.printf("%s %s %d %d\n", c3.getModel(), c3.getMaker(), c3.getCc(), c3.getCapacity());

  }

}
