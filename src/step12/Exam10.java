/* 주제: 인스턴스 변수의 this 생략, 스태틱 변수의 클래스명 생략*/
package step12;

public class Exam10 {
  public static void main(String[] args) {

    Car7 c1 = new Car7("티코", "비트자동차", 2000, 5); // 인스턴스(model, maker, cc, capacity 묶음) 한 개 준비
    Car7 c2 = new Car7("그랜저", "비트자동차", 3000, 7);
    Car7 c3 = new Car7();
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

    System.out.printf("%d %s %s %d %d\n", c1.getNo(), c1.getModel(), c1.getMaker(), c1.getCc(), c1.getCapacity());
    System.out.printf("%d %s %s %d %d\n", c2.getNo(), c2.getModel(), c2.getMaker(), c2.getCc(), c2.getCapacity());
    System.out.printf("%d %s %s %d %d\n", c3.getNo(), c3.getModel(), c3.getMaker(), c3.getCc(), c3.getCapacity());

    // System.out.println(c3.toString()); // 출력 :step12.Car7@2de80c 해시코드 (step13 - Exam03)
  }

}
