/* 주제: 변수와 메서드 정리 - 인스턴스 변수의 사용 */
package step12;

public class Exam05 {
  public static void main(String[] args) {
    // 인스턴스 변수에 접근하려면 다음과 같이 해서는 안된다.
    /*
    Car.model = "티코";
    Car.maker = "비트자동차";
    Car.cc = 2000;
    Car.capacity = 5;
    */

    // 인스턴스 변수에 접근하려면 먼저
    // 그 클래스의 인스턴스(클래스 설계도에 따라 준비한 메모리)를 생성한다.
    /*
    new Car2(); // 인스턴스(model, maker, cc, capacity 묶음) 한 개 준비 (Heap)
    Car2 car1 = new Car2();// 주소를 리턴받을 레퍼런스 변수 car1 준비. (주소가 없으면 메모리를 만들어도 접근 불가능)
    */
    Car2 c1 = new Car2(); // 인스턴스(model, maker, cc, capacity 묶음) 한 개 준비
    Car2 c2 = new Car2(); // 인스턴스(model, maker, cc, capacity 묶음) 한 개 준비
    Car2 c3 = new Car2();

    c1.model = "티코";
    c1.maker = "비트자동차";
    c1.cc = 2000;
    c1.capacity = 5;

    c2.model = "그랜저";
    c2.maker = "비트자동차";
    c2.cc = 3000;
    c2.capacity = 5;

    c3.model = "코란도";
    c3.maker = "비트자동차";
    c3.cc = 3500;
    c3.capacity = 2;


  }

}
