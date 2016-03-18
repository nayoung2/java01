package step12;

public class Car4 {
  // 자동차 마다 개별 정보를 저장할 변수

  String model;
  String maker;
  int cc;
  int capacity;

  Car4() {}

  Car4(String model, String maker, int cc, int capacity) {
    this.model = model; // this라는 주소에 있는 인스턴스 메모리 = 파라미터의 변수
    this.maker = maker;
    this.cc = cc;
    this.capacity = capacity;

  }

}
